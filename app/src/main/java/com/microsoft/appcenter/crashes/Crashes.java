package com.microsoft.appcenter.crashes;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.microsoft.appcenter.AbstractAppCenterService;
import com.microsoft.appcenter.channel.Channel;
import com.microsoft.appcenter.crashes.ingestion.models.ErrorAttachmentLog;
import com.microsoft.appcenter.crashes.ingestion.models.Exception;
import com.microsoft.appcenter.crashes.ingestion.models.HandledErrorLog;
import com.microsoft.appcenter.crashes.ingestion.models.ManagedErrorLog;
import com.microsoft.appcenter.crashes.ingestion.models.json.ErrorAttachmentLogFactory;
import com.microsoft.appcenter.crashes.ingestion.models.json.HandledErrorLogFactory;
import com.microsoft.appcenter.crashes.ingestion.models.json.ManagedErrorLogFactory;
import com.microsoft.appcenter.crashes.model.ErrorReport;
import com.microsoft.appcenter.crashes.model.NativeException;
import com.microsoft.appcenter.crashes.utils.ErrorLogHelper;
import com.microsoft.appcenter.ingestion.models.Device;
import com.microsoft.appcenter.ingestion.models.Log;
import com.microsoft.appcenter.ingestion.models.json.DefaultLogSerializer;
import com.microsoft.appcenter.ingestion.models.json.LogFactory;
import com.microsoft.appcenter.ingestion.models.json.LogSerializer;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.microsoft.appcenter.utils.DeviceInfoHelper;
import com.microsoft.appcenter.utils.HandlerUtils;
import com.microsoft.appcenter.utils.async.AppCenterFuture;
import com.microsoft.appcenter.utils.context.SessionContext;
import com.microsoft.appcenter.utils.context.UserIdContext;
import com.microsoft.appcenter.utils.storage.FileManager;
import com.microsoft.appcenter.utils.storage.SharedPreferencesManager;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
/* loaded from: classes.dex */
public class Crashes extends AbstractAppCenterService {
    private static final CrashesListener DEFAULT_ERROR_REPORTING_LISTENER = new DefaultCrashesListener(null);
    @SuppressLint({"StaticFieldLeak"})
    private static Crashes sInstance = null;
    private Context mContext;
    private Device mDevice;
    private final Map<String, LogFactory> mFactories;
    private boolean mHasReceivedMemoryWarningInLastSession;
    private long mInitializeTimestamp;
    private LogSerializer mLogSerializer;
    private ComponentCallbacks2 mMemoryWarningListener;
    private boolean mSavedUncaughtException;
    private UncaughtExceptionHandler mUncaughtExceptionHandler;
    private boolean mAutomaticProcessing = true;
    private CrashesListener mCrashesListener = DEFAULT_ERROR_REPORTING_LISTENER;
    private final Map<UUID, ErrorLogReport> mUnprocessedErrorReports = new LinkedHashMap();
    private final Map<UUID, ErrorLogReport> mErrorReportCache = new LinkedHashMap();

    /* renamed from: com.microsoft.appcenter.crashes.Crashes$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
    }

    /* loaded from: classes.dex */
    public interface CallbackProcessor {
        void onCallBack(ErrorReport errorReport);

        boolean shouldDeleteThrowable();
    }

    /* loaded from: classes.dex */
    public interface ExceptionModelBuilder {
        Exception buildExceptionModel();
    }

    private static boolean isMemoryRunningLevelWasReceived(int i) {
        return i == 5 || i == 10 || i == 15 || i == 80;
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected String getGroupName() {
        return "groupErrors";
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected String getLoggerTag() {
        return "AppCenterCrashes";
    }

    @Override // com.microsoft.appcenter.AppCenterService
    public String getServiceName() {
        return "Crashes";
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected int getTriggerCount() {
        return 1;
    }

    private Crashes() {
        HashMap hashMap = new HashMap();
        this.mFactories = hashMap;
        hashMap.put("managedError", ManagedErrorLogFactory.getInstance());
        hashMap.put("handledError", HandledErrorLogFactory.getInstance());
        hashMap.put("errorAttachment", ErrorAttachmentLogFactory.getInstance());
        DefaultLogSerializer defaultLogSerializer = new DefaultLogSerializer();
        this.mLogSerializer = defaultLogSerializer;
        defaultLogSerializer.addLogFactory("managedError", ManagedErrorLogFactory.getInstance());
        this.mLogSerializer.addLogFactory("errorAttachment", ErrorAttachmentLogFactory.getInstance());
    }

    public static synchronized Crashes getInstance() {
        Crashes crashes;
        synchronized (Crashes.class) {
            if (sInstance == null) {
                sInstance = new Crashes();
            }
            crashes = sInstance;
        }
        return crashes;
    }

    public static AppCenterFuture<Boolean> isEnabled() {
        return getInstance().isInstanceEnabledAsync();
    }

    public static void trackError(Throwable th) {
        trackError(th, null, null);
    }

    public static void trackError(Throwable th, Map<String, String> map, Iterable<ErrorAttachmentLog> iterable) {
        getInstance().queueException(th, map, iterable);
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected synchronized void applyEnabledState(boolean z) {
        initialize();
        if (z) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this);
            this.mMemoryWarningListener = anonymousClass5;
            this.mContext.registerComponentCallbacks(anonymousClass5);
        } else {
            File[] listFiles = ErrorLogHelper.getErrorStorageDirectory().listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    AppCenterLog.debug("AppCenterCrashes", "Deleting file " + file);
                    if (!file.delete()) {
                        AppCenterLog.warn("AppCenterCrashes", "Failed to delete file " + file);
                    }
                }
            }
            AppCenterLog.info("AppCenterCrashes", "Deleted crashes local files");
            this.mErrorReportCache.clear();
            this.mContext.unregisterComponentCallbacks(this.mMemoryWarningListener);
            this.mMemoryWarningListener = null;
            SharedPreferencesManager.remove("com.microsoft.appcenter.crashes.memory");
        }
    }

    /* renamed from: com.microsoft.appcenter.crashes.Crashes$5 */
    /* loaded from: classes.dex */
    class AnonymousClass5 implements ComponentCallbacks2 {
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        AnonymousClass5(Crashes crashes) {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            Crashes.saveMemoryRunningLevel(i);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            Crashes.saveMemoryRunningLevel(80);
        }
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService, com.microsoft.appcenter.AppCenterService
    public synchronized void onStarted(Context context, Channel channel, String str, String str2, boolean z) {
        this.mContext = context;
        if (!isInstanceEnabled()) {
            ErrorLogHelper.removeMinidumpFolder();
            AppCenterLog.debug("AppCenterCrashes", "Clean up minidump folder.");
        }
        super.onStarted(context, channel, str, str2, z);
        if (isInstanceEnabled()) {
            processPendingErrors();
        }
    }

    @Override // com.microsoft.appcenter.AppCenterService
    public Map<String, LogFactory> getLogFactories() {
        return this.mFactories;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.microsoft.appcenter.crashes.Crashes$6 */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements Channel.GroupListener {
        AnonymousClass6() {
            Crashes.this = r1;
        }

        /* renamed from: com.microsoft.appcenter.crashes.Crashes$6$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Runnable {
            final /* synthetic */ CallbackProcessor val$callbackProcessor;
            final /* synthetic */ Log val$log;

            AnonymousClass1(Log log, CallbackProcessor callbackProcessor) {
                AnonymousClass6.this = r1;
                this.val$log = log;
                this.val$callbackProcessor = callbackProcessor;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log log = this.val$log;
                if (log instanceof ManagedErrorLog) {
                    ManagedErrorLog managedErrorLog = (ManagedErrorLog) log;
                    ErrorReport buildErrorReport = Crashes.this.buildErrorReport(managedErrorLog);
                    UUID id = managedErrorLog.getId();
                    if (buildErrorReport != null) {
                        if (this.val$callbackProcessor.shouldDeleteThrowable()) {
                            Crashes.this.removeStoredThrowable(id);
                        }
                        HandlerUtils.runOnUiThread(new RunnableC00071(buildErrorReport));
                        return;
                    }
                    AppCenterLog.warn("AppCenterCrashes", "Cannot find crash report for the error log: " + id);
                } else if ((log instanceof ErrorAttachmentLog) || (log instanceof HandledErrorLog)) {
                } else {
                    AppCenterLog.warn("AppCenterCrashes", "A different type of log comes to crashes: " + this.val$log.getClass().getName());
                }
            }

            /* renamed from: com.microsoft.appcenter.crashes.Crashes$6$1$1 */
            /* loaded from: classes.dex */
            class RunnableC00071 implements Runnable {
                final /* synthetic */ ErrorReport val$report;

                RunnableC00071(ErrorReport errorReport) {
                    AnonymousClass1.this = r1;
                    this.val$report = errorReport;
                }

                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1.this.val$callbackProcessor.onCallBack(this.val$report);
                }
            }
        }

        private void processCallback(Log log, CallbackProcessor callbackProcessor) {
            Crashes.this.post(new AnonymousClass1(log, callbackProcessor));
        }

        /* renamed from: com.microsoft.appcenter.crashes.Crashes$6$2 */
        /* loaded from: classes.dex */
        class AnonymousClass2 implements CallbackProcessor {
            @Override // com.microsoft.appcenter.crashes.Crashes.CallbackProcessor
            public boolean shouldDeleteThrowable() {
                return false;
            }

            AnonymousClass2() {
                AnonymousClass6.this = r1;
            }

            @Override // com.microsoft.appcenter.crashes.Crashes.CallbackProcessor
            public void onCallBack(ErrorReport errorReport) {
                Crashes.this.mCrashesListener.onBeforeSending(errorReport);
            }
        }

        @Override // com.microsoft.appcenter.channel.Channel.GroupListener
        public void onBeforeSending(Log log) {
            processCallback(log, new AnonymousClass2());
        }

        /* renamed from: com.microsoft.appcenter.crashes.Crashes$6$3 */
        /* loaded from: classes.dex */
        class AnonymousClass3 implements CallbackProcessor {
            @Override // com.microsoft.appcenter.crashes.Crashes.CallbackProcessor
            public boolean shouldDeleteThrowable() {
                return true;
            }

            AnonymousClass3() {
                AnonymousClass6.this = r1;
            }

            @Override // com.microsoft.appcenter.crashes.Crashes.CallbackProcessor
            public void onCallBack(ErrorReport errorReport) {
                Crashes.this.mCrashesListener.onSendingSucceeded(errorReport);
            }
        }

        @Override // com.microsoft.appcenter.channel.Channel.GroupListener
        public void onSuccess(Log log) {
            processCallback(log, new AnonymousClass3());
        }

        /* renamed from: com.microsoft.appcenter.crashes.Crashes$6$4 */
        /* loaded from: classes.dex */
        class AnonymousClass4 implements CallbackProcessor {
            final /* synthetic */ Exception val$e;

            @Override // com.microsoft.appcenter.crashes.Crashes.CallbackProcessor
            public boolean shouldDeleteThrowable() {
                return true;
            }

            AnonymousClass4(Exception exc) {
                AnonymousClass6.this = r1;
                this.val$e = exc;
            }

            @Override // com.microsoft.appcenter.crashes.Crashes.CallbackProcessor
            public void onCallBack(ErrorReport errorReport) {
                Crashes.this.mCrashesListener.onSendingFailed(errorReport, this.val$e);
            }
        }

        @Override // com.microsoft.appcenter.channel.Channel.GroupListener
        public void onFailure(Log log, Exception exc) {
            processCallback(log, new AnonymousClass4(exc));
        }
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected Channel.GroupListener getChannelListener() {
        return new AnonymousClass6();
    }

    synchronized Device getDeviceInfo(Context context) throws DeviceInfoHelper.DeviceInfoException {
        if (this.mDevice == null) {
            this.mDevice = DeviceInfoHelper.getDeviceInfo(context);
        }
        return this.mDevice;
    }

    /* renamed from: com.microsoft.appcenter.crashes.Crashes$7 */
    /* loaded from: classes.dex */
    public class AnonymousClass7 implements ExceptionModelBuilder {
        final /* synthetic */ Throwable val$throwable;

        AnonymousClass7(Crashes crashes, Throwable th) {
            this.val$throwable = th;
        }

        @Override // com.microsoft.appcenter.crashes.Crashes.ExceptionModelBuilder
        public Exception buildExceptionModel() {
            return ErrorLogHelper.getModelExceptionFromThrowable(this.val$throwable);
        }
    }

    private synchronized void queueException(Throwable th, Map<String, String> map, Iterable<ErrorAttachmentLog> iterable) {
        queueException(new AnonymousClass7(this, th), map, iterable);
    }

    private synchronized UUID queueException(ExceptionModelBuilder exceptionModelBuilder, Map<String, String> map, Iterable<ErrorAttachmentLog> iterable) {
        UUID randomUUID;
        String userId = UserIdContext.getInstance().getUserId();
        randomUUID = UUID.randomUUID();
        post(new AnonymousClass9(randomUUID, userId, exceptionModelBuilder, ErrorLogHelper.validateProperties(map, "HandledError"), iterable));
        return randomUUID;
    }

    /* renamed from: com.microsoft.appcenter.crashes.Crashes$9 */
    /* loaded from: classes.dex */
    public class AnonymousClass9 implements Runnable {
        final /* synthetic */ Iterable val$attachments;
        final /* synthetic */ UUID val$errorId;
        final /* synthetic */ ExceptionModelBuilder val$exceptionModelBuilder;
        final /* synthetic */ String val$userId;
        final /* synthetic */ Map val$validatedProperties;

        AnonymousClass9(UUID uuid, String str, ExceptionModelBuilder exceptionModelBuilder, Map map, Iterable iterable) {
            Crashes.this = r1;
            this.val$errorId = uuid;
            this.val$userId = str;
            this.val$exceptionModelBuilder = exceptionModelBuilder;
            this.val$validatedProperties = map;
            this.val$attachments = iterable;
        }

        @Override // java.lang.Runnable
        public void run() {
            HandledErrorLog handledErrorLog = new HandledErrorLog();
            handledErrorLog.setId(this.val$errorId);
            handledErrorLog.setUserId(this.val$userId);
            handledErrorLog.setException(this.val$exceptionModelBuilder.buildExceptionModel());
            handledErrorLog.setProperties(this.val$validatedProperties);
            ((AbstractAppCenterService) Crashes.this).mChannel.enqueue(handledErrorLog, "groupErrors", 1);
            Crashes.this.sendErrorAttachment(this.val$errorId, this.val$attachments);
        }
    }

    private void initialize() {
        boolean isInstanceEnabled = isInstanceEnabled();
        this.mInitializeTimestamp = isInstanceEnabled ? System.currentTimeMillis() : -1L;
        if (!isInstanceEnabled) {
            UncaughtExceptionHandler uncaughtExceptionHandler = this.mUncaughtExceptionHandler;
            if (uncaughtExceptionHandler == null) {
                return;
            }
            uncaughtExceptionHandler.unregister();
            this.mUncaughtExceptionHandler = null;
            return;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler2 = new UncaughtExceptionHandler();
        this.mUncaughtExceptionHandler = uncaughtExceptionHandler2;
        uncaughtExceptionHandler2.register();
        processMinidumpFiles();
    }

    private void processMinidumpFiles() {
        File[] newMinidumpFiles;
        for (File file : ErrorLogHelper.getNewMinidumpFiles()) {
            if (!file.isDirectory()) {
                AppCenterLog.debug("AppCenterCrashes", "Found a minidump from a previous SDK version.");
                processSingleMinidump(file, file);
            } else {
                File[] listFiles = file.listFiles(new AnonymousClass10(this));
                if (listFiles != null && listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        processSingleMinidump(file2, file);
                    }
                }
            }
        }
        File lastErrorLogFile = ErrorLogHelper.getLastErrorLogFile();
        while (lastErrorLogFile != null && lastErrorLogFile.length() == 0) {
            AppCenterLog.warn("AppCenterCrashes", "Deleting empty error file: " + lastErrorLogFile);
            lastErrorLogFile.delete();
            lastErrorLogFile = ErrorLogHelper.getLastErrorLogFile();
        }
        if (lastErrorLogFile != null) {
            AppCenterLog.debug("AppCenterCrashes", "Processing crash report for the last session.");
            String read = FileManager.read(lastErrorLogFile);
            if (read == null) {
                AppCenterLog.error("AppCenterCrashes", "Error reading last session error log.");
            } else {
                try {
                    buildErrorReport((ManagedErrorLog) this.mLogSerializer.deserializeLog(read, null));
                    AppCenterLog.debug("AppCenterCrashes", "Processed crash report for the last session.");
                } catch (JSONException e) {
                    AppCenterLog.error("AppCenterCrashes", "Error parsing last session error log.", e);
                }
            }
        }
        ErrorLogHelper.removeStaleMinidumpSubfolders();
    }

    /* renamed from: com.microsoft.appcenter.crashes.Crashes$10 */
    /* loaded from: classes.dex */
    public class AnonymousClass10 implements FilenameFilter {
        AnonymousClass10(Crashes crashes) {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".dmp");
        }
    }

    private void processSingleMinidump(File file, File file2) {
        AppCenterLog.debug("AppCenterCrashes", "Process pending minidump file: " + file);
        long lastModified = file.lastModified();
        File file3 = new File(ErrorLogHelper.getPendingMinidumpDirectory(), file.getName());
        Exception exception = new Exception();
        exception.setType("minidump");
        exception.setWrapperSdkName("appcenter.ndk");
        exception.setMinidumpFilePath(file3.getPath());
        ManagedErrorLog managedErrorLog = new ManagedErrorLog();
        managedErrorLog.setException(exception);
        managedErrorLog.setTimestamp(new Date(lastModified));
        managedErrorLog.setFatal(Boolean.TRUE);
        managedErrorLog.setId(ErrorLogHelper.parseLogFolderUuid(file2));
        SessionContext.SessionInfo sessionAt = SessionContext.getInstance().getSessionAt(lastModified);
        if (sessionAt != null && sessionAt.getAppLaunchTimestamp() <= lastModified) {
            managedErrorLog.setAppLaunchTimestamp(new Date(sessionAt.getAppLaunchTimestamp()));
        } else {
            managedErrorLog.setAppLaunchTimestamp(managedErrorLog.getTimestamp());
        }
        managedErrorLog.setProcessId(0);
        managedErrorLog.setProcessName("");
        managedErrorLog.setUserId(UserIdContext.getInstance().getUserId());
        try {
            Device storedDeviceInfo = ErrorLogHelper.getStoredDeviceInfo(file2);
            if (storedDeviceInfo == null) {
                storedDeviceInfo = getDeviceInfo(this.mContext);
                storedDeviceInfo.setWrapperSdkName("appcenter.ndk");
            }
            managedErrorLog.setDevice(storedDeviceInfo);
            saveErrorLogFiles(new NativeException(), managedErrorLog);
            if (file.renameTo(file3)) {
                return;
            }
            throw new IOException("Failed to move file");
        } catch (Exception e) {
            file.delete();
            removeAllStoredErrorLogFiles(managedErrorLog.getId());
            AppCenterLog.error("AppCenterCrashes", "Failed to process new minidump file: " + file, e);
        }
    }

    private void processPendingErrors() {
        File[] storedErrorLogFiles;
        for (File file : ErrorLogHelper.getStoredErrorLogFiles()) {
            AppCenterLog.debug("AppCenterCrashes", "Process pending error file: " + file);
            String read = FileManager.read(file);
            if (read != null) {
                try {
                    ManagedErrorLog managedErrorLog = (ManagedErrorLog) this.mLogSerializer.deserializeLog(read, null);
                    UUID id = managedErrorLog.getId();
                    ErrorReport buildErrorReport = buildErrorReport(managedErrorLog);
                    if (buildErrorReport == null) {
                        removeAllStoredErrorLogFiles(id);
                    } else {
                        if (this.mAutomaticProcessing && !this.mCrashesListener.shouldProcess(buildErrorReport)) {
                            AppCenterLog.debug("AppCenterCrashes", "CrashesListener.shouldProcess returned false, clean up and ignore log: " + id.toString());
                            removeAllStoredErrorLogFiles(id);
                        }
                        if (!this.mAutomaticProcessing) {
                            AppCenterLog.debug("AppCenterCrashes", "CrashesListener.shouldProcess returned true, continue processing log: " + id.toString());
                        }
                        this.mUnprocessedErrorReports.put(id, this.mErrorReportCache.get(id));
                    }
                } catch (JSONException e) {
                    AppCenterLog.error("AppCenterCrashes", "Error parsing error log. Deleting invalid file: " + file, e);
                    file.delete();
                }
            }
        }
        boolean isMemoryRunningLevelWasReceived = isMemoryRunningLevelWasReceived(SharedPreferencesManager.getInt("com.microsoft.appcenter.crashes.memory", -1));
        this.mHasReceivedMemoryWarningInLastSession = isMemoryRunningLevelWasReceived;
        if (isMemoryRunningLevelWasReceived) {
            AppCenterLog.debug("AppCenterCrashes", "The application received a low memory warning in the last session.");
        }
        SharedPreferencesManager.remove("com.microsoft.appcenter.crashes.memory");
        if (this.mAutomaticProcessing) {
            sendCrashReportsOrAwaitUserConfirmation();
        }
    }

    /* renamed from: com.microsoft.appcenter.crashes.Crashes$11 */
    /* loaded from: classes.dex */
    public class AnonymousClass11 implements Runnable {
        final /* synthetic */ boolean val$alwaysSend;

        AnonymousClass11(boolean z) {
            Crashes.this = r1;
            this.val$alwaysSend = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Crashes.this.mUnprocessedErrorReports.size() > 0) {
                if (!this.val$alwaysSend) {
                    if (Crashes.this.mAutomaticProcessing) {
                        if (!Crashes.this.mCrashesListener.shouldAwaitUserConfirmation()) {
                            AppCenterLog.debug("AppCenterCrashes", "CrashesListener.shouldAwaitUserConfirmation returned false, will send logs.");
                            Crashes.this.handleUserConfirmation(0);
                            return;
                        }
                        AppCenterLog.debug("AppCenterCrashes", "CrashesListener.shouldAwaitUserConfirmation returned true, wait sending logs.");
                        return;
                    }
                    AppCenterLog.debug("AppCenterCrashes", "Automatic processing disabled, will wait for explicit user confirmation.");
                    return;
                }
                AppCenterLog.debug("AppCenterCrashes", "The flag for user confirmation is set to ALWAYS_SEND, will send logs.");
                Crashes.this.handleUserConfirmation(0);
            }
        }
    }

    private boolean sendCrashReportsOrAwaitUserConfirmation() {
        boolean z = SharedPreferencesManager.getBoolean("com.microsoft.appcenter.crashes.always.send", false);
        HandlerUtils.runOnUiThread(new AnonymousClass11(z));
        return z;
    }

    public void removeAllStoredErrorLogFiles(UUID uuid) {
        ErrorLogHelper.removeStoredErrorLogFile(uuid);
        removeStoredThrowable(uuid);
    }

    public void removeStoredThrowable(UUID uuid) {
        this.mErrorReportCache.remove(uuid);
        WrapperSdkExceptionManager.deleteWrapperExceptionData(uuid);
        ErrorLogHelper.removeStoredThrowableFile(uuid);
    }

    ErrorReport buildErrorReport(ManagedErrorLog managedErrorLog) {
        UUID id = managedErrorLog.getId();
        if (!this.mErrorReportCache.containsKey(id)) {
            File storedThrowableFile = ErrorLogHelper.getStoredThrowableFile(id);
            if (storedThrowableFile == null) {
                return null;
            }
            ErrorReport errorReportFromErrorLog = ErrorLogHelper.getErrorReportFromErrorLog(managedErrorLog, storedThrowableFile.length() > 0 ? FileManager.read(storedThrowableFile) : null);
            this.mErrorReportCache.put(id, new ErrorLogReport(managedErrorLog, errorReportFromErrorLog, null));
            return errorReportFromErrorLog;
        }
        ErrorReport errorReport = this.mErrorReportCache.get(id).report;
        errorReport.setDevice(managedErrorLog.getDevice());
        return errorReport;
    }

    /* renamed from: com.microsoft.appcenter.crashes.Crashes$12 */
    /* loaded from: classes.dex */
    public class AnonymousClass12 implements Runnable {
        final /* synthetic */ int val$userConfirmation;

        AnonymousClass12(int i) {
            Crashes.this = r1;
            this.val$userConfirmation = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f3 A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            File file;
            int i = this.val$userConfirmation;
            if (i == 1) {
                Iterator it = Crashes.this.mUnprocessedErrorReports.keySet().iterator();
                while (it.hasNext()) {
                    it.remove();
                    Crashes.this.removeAllStoredErrorLogFiles((UUID) it.next());
                }
                ErrorLogHelper.cleanPendingMinidumps();
                return;
            }
            if (i == 2) {
                SharedPreferencesManager.putBoolean("com.microsoft.appcenter.crashes.always.send", true);
            }
            Iterator it2 = Crashes.this.mUnprocessedErrorReports.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                ErrorLogReport errorLogReport = (ErrorLogReport) entry.getValue();
                ErrorAttachmentLog errorAttachmentLog = null;
                if (errorLogReport.report.getDevice() != null && "appcenter.ndk".equals(errorLogReport.report.getDevice().getWrapperSdkName())) {
                    Exception exception = errorLogReport.log.getException();
                    String minidumpFilePath = exception.getMinidumpFilePath();
                    exception.setMinidumpFilePath(null);
                    if (minidumpFilePath == null) {
                        minidumpFilePath = exception.getStackTrace();
                        exception.setStackTrace(null);
                    }
                    if (minidumpFilePath != null) {
                        File file2 = new File(minidumpFilePath);
                        errorAttachmentLog = ErrorAttachmentLog.attachmentWithBinary(FileManager.readBytes(file2), "minidump.dmp", "application/octet-stream");
                        file = file2;
                        ((AbstractAppCenterService) Crashes.this).mChannel.enqueue(errorLogReport.log, "groupErrors", 2);
                        if (errorAttachmentLog != null) {
                            Crashes.this.sendErrorAttachment(errorLogReport.log.getId(), Collections.singleton(errorAttachmentLog));
                            file.delete();
                        }
                        if (!Crashes.this.mAutomaticProcessing) {
                            Crashes.this.sendErrorAttachment(errorLogReport.log.getId(), Crashes.this.mCrashesListener.getErrorAttachments(errorLogReport.report));
                        }
                        it2.remove();
                        ErrorLogHelper.removeStoredErrorLogFile((UUID) entry.getKey());
                    } else {
                        AppCenterLog.warn("AppCenterCrashes", "NativeException found without minidump.");
                    }
                }
                file = null;
                ((AbstractAppCenterService) Crashes.this).mChannel.enqueue(errorLogReport.log, "groupErrors", 2);
                if (errorAttachmentLog != null) {
                }
                if (!Crashes.this.mAutomaticProcessing) {
                }
                it2.remove();
                ErrorLogHelper.removeStoredErrorLogFile((UUID) entry.getKey());
            }
        }
    }

    public synchronized void handleUserConfirmation(int i) {
        post(new AnonymousClass12(i));
    }

    public void sendErrorAttachment(UUID uuid, Iterable<ErrorAttachmentLog> iterable) {
        if (iterable == null) {
            AppCenterLog.debug("AppCenterCrashes", "Error report: " + uuid.toString() + " does not have any attachment.");
            return;
        }
        for (ErrorAttachmentLog errorAttachmentLog : iterable) {
            if (errorAttachmentLog != null) {
                errorAttachmentLog.setId(UUID.randomUUID());
                errorAttachmentLog.setErrorId(uuid);
                if (!errorAttachmentLog.isValid()) {
                    AppCenterLog.error("AppCenterCrashes", "Not all required fields are present in ErrorAttachmentLog.");
                } else if (errorAttachmentLog.getData().length > 7340032) {
                    AppCenterLog.error("AppCenterCrashes", String.format(Locale.ENGLISH, "Discarding attachment with size above %d bytes: size=%d, fileName=%s.", 7340032, Integer.valueOf(errorAttachmentLog.getData().length), errorAttachmentLog.getFileName()));
                } else {
                    this.mChannel.enqueue(errorAttachmentLog, "groupErrors", 1);
                }
            } else {
                AppCenterLog.warn("AppCenterCrashes", "Skipping null ErrorAttachmentLog.");
            }
        }
    }

    public void saveUncaughtException(Thread thread, Throwable th) {
        try {
            saveUncaughtException(thread, th, ErrorLogHelper.getModelExceptionFromThrowable(th));
        } catch (IOException e) {
            AppCenterLog.error("AppCenterCrashes", "Error writing error log to file", e);
        } catch (JSONException e2) {
            AppCenterLog.error("AppCenterCrashes", "Error serializing error log to JSON", e2);
        }
    }

    UUID saveUncaughtException(Thread thread, Throwable th, Exception exception) throws JSONException, IOException {
        if (isEnabled().get().booleanValue() && !this.mSavedUncaughtException) {
            this.mSavedUncaughtException = true;
            return saveErrorLogFiles(th, ErrorLogHelper.createErrorLog(this.mContext, thread, exception, Thread.getAllStackTraces(), this.mInitializeTimestamp, true));
        }
        return null;
    }

    private UUID saveErrorLogFiles(Throwable th, ManagedErrorLog managedErrorLog) throws JSONException, IOException {
        File errorStorageDirectory = ErrorLogHelper.getErrorStorageDirectory();
        UUID id = managedErrorLog.getId();
        String uuid = id.toString();
        AppCenterLog.debug("AppCenterCrashes", "Saving uncaught exception.");
        File file = new File(errorStorageDirectory, uuid + ".json");
        FileManager.write(file, this.mLogSerializer.serializeLog(managedErrorLog));
        AppCenterLog.debug("AppCenterCrashes", "Saved JSON content for ingestion into " + file);
        File file2 = new File(errorStorageDirectory, uuid + ".throwable");
        if (th != null) {
            try {
                String stackTraceString = android.util.Log.getStackTraceString(th);
                FileManager.write(file2, stackTraceString);
                AppCenterLog.debug("AppCenterCrashes", "Saved stack trace as is for client side inspection in " + file2 + " stack trace:" + stackTraceString);
            } catch (StackOverflowError e) {
                AppCenterLog.error("AppCenterCrashes", "Failed to store stack trace.", e);
                th = null;
                file2.delete();
            }
        }
        if (th == null) {
            if (!file2.createNewFile()) {
                throw new IOException(file2.getName());
            }
            AppCenterLog.debug("AppCenterCrashes", "Saved empty Throwable file in " + file2);
        }
        return id;
    }

    public static void saveMemoryRunningLevel(int i) {
        SharedPreferencesManager.putInt("com.microsoft.appcenter.crashes.memory", i);
        AppCenterLog.debug("AppCenterCrashes", String.format("The memory running level (%s) was saved.", Integer.valueOf(i)));
    }

    /* loaded from: classes.dex */
    private static class DefaultCrashesListener extends AbstractCrashesListener {
        private DefaultCrashesListener() {
        }

        /* synthetic */ DefaultCrashesListener(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class ErrorLogReport {
        private final ManagedErrorLog log;
        private final ErrorReport report;

        /* synthetic */ ErrorLogReport(ManagedErrorLog managedErrorLog, ErrorReport errorReport, AnonymousClass1 anonymousClass1) {
            this(managedErrorLog, errorReport);
        }

        private ErrorLogReport(ManagedErrorLog managedErrorLog, ErrorReport errorReport) {
            this.log = managedErrorLog;
            this.report = errorReport;
        }
    }
}
