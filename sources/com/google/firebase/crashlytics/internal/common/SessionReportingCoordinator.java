package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import org.telegram.messenger.LiteMode;

/* loaded from: classes3.dex */
public class SessionReportingCoordinator {
    private final CrashlyticsReportDataCapture dataCapture;
    private final IdManager idManager;
    private final LogFileManager logFileManager;
    private final UserMetadata reportMetadata;
    private final CrashlyticsReportPersistence reportPersistence;
    private final DataTransportCrashlyticsReportSender reportsSender;

    SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata, IdManager idManager) {
        this.dataCapture = crashlyticsReportDataCapture;
        this.reportPersistence = crashlyticsReportPersistence;
        this.reportsSender = dataTransportCrashlyticsReportSender;
        this.logFileManager = logFileManager;
        this.reportMetadata = userMetadata;
        this.idManager = idManager;
    }

    private CrashlyticsReport.Session.Event addLogsAndCustomKeysToEvent(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata) {
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        String logString = logFileManager.getLogString();
        if (logString != null) {
            builder.setLog(CrashlyticsReport.Session.Event.Log.builder().setContent(logString).build());
        } else {
            Logger.getLogger().v("No log data to include with this event.");
        }
        List sortedCustomAttributes = getSortedCustomAttributes(userMetadata.getCustomKeys());
        List sortedCustomAttributes2 = getSortedCustomAttributes(userMetadata.getInternalKeys());
        if (!sortedCustomAttributes.isEmpty() || !sortedCustomAttributes2.isEmpty()) {
            builder.setApp(event.getApp().toBuilder().setCustomAttributes(sortedCustomAttributes).setInternalKeys(sortedCustomAttributes2).build());
        }
        return builder.build();
    }

    private CrashlyticsReport.Session.Event addMetaDataToEvent(CrashlyticsReport.Session.Event event) {
        return addRolloutsStateToEvent(addLogsAndCustomKeysToEvent(event, this.logFileManager, this.reportMetadata), this.reportMetadata);
    }

    private CrashlyticsReport.Session.Event addRolloutsStateToEvent(CrashlyticsReport.Session.Event event, UserMetadata userMetadata) {
        List rolloutsState = userMetadata.getRolloutsState();
        if (rolloutsState.isEmpty()) {
            return event;
        }
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        builder.setRollouts(CrashlyticsReport.Session.Event.RolloutsState.builder().setRolloutAssignments(rolloutsState).build());
        return builder.build();
    }

    private static CrashlyticsReport.ApplicationExitInfo convertApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = convertInputStreamToString(traceInputStream);
            }
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb.append(applicationExitInfo2);
            sb.append(" Error: ");
            sb.append(e);
            logger.w(sb.toString());
        }
        CrashlyticsReport.ApplicationExitInfo.Builder builder = CrashlyticsReport.ApplicationExitInfo.builder();
        importance = applicationExitInfo.getImportance();
        CrashlyticsReport.ApplicationExitInfo.Builder importance2 = builder.setImportance(importance);
        processName = applicationExitInfo.getProcessName();
        CrashlyticsReport.ApplicationExitInfo.Builder processName2 = importance2.setProcessName(processName);
        reason = applicationExitInfo.getReason();
        CrashlyticsReport.ApplicationExitInfo.Builder reasonCode = processName2.setReasonCode(reason);
        timestamp = applicationExitInfo.getTimestamp();
        CrashlyticsReport.ApplicationExitInfo.Builder timestamp2 = reasonCode.setTimestamp(timestamp);
        pid = applicationExitInfo.getPid();
        CrashlyticsReport.ApplicationExitInfo.Builder pid2 = timestamp2.setPid(pid);
        pss = applicationExitInfo.getPss();
        CrashlyticsReport.ApplicationExitInfo.Builder pss2 = pid2.setPss(pss);
        rss = applicationExitInfo.getRss();
        return pss2.setRss(rss).setTraceFile(str).build();
    }

    public static String convertInputStreamToString(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static SessionReportingCoordinator create(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy, settingsProvider), new CrashlyticsReportPersistence(fileStore, settingsProvider, crashlyticsAppQualitySessionsSubscriber), DataTransportCrashlyticsReportSender.create(context, settingsProvider, onDemandCounter), logFileManager, userMetadata, idManager);
    }

    private CrashlyticsReportWithSessionId ensureHasFid(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        if (crashlyticsReportWithSessionId.getReport().getFirebaseInstallationId() != null) {
            return crashlyticsReportWithSessionId;
        }
        return CrashlyticsReportWithSessionId.create(crashlyticsReportWithSessionId.getReport().withFirebaseInstallationId(this.idManager.fetchTrueFid()), crashlyticsReportWithSessionId.getSessionId(), crashlyticsReportWithSessionId.getReportFile());
    }

    private ApplicationExitInfo findRelevantApplicationExitInfo(String str, List list) {
        long timestamp;
        int reason;
        long startTimestampMillis = this.reportPersistence.getStartTimestampMillis(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo m = SessionReportingCoordinator$$ExternalSyntheticApiModelOutline0.m(it.next());
            timestamp = m.getTimestamp();
            if (timestamp < startTimestampMillis) {
                return null;
            }
            reason = m.getReason();
            if (reason == 6) {
                return m;
            }
        }
        return null;
    }

    private static List getSortedCustomAttributes(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(CrashlyticsReport.CustomAttribute.builder().setKey((String) entry.getKey()).setValue((String) entry.getValue()).build());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator$$ExternalSyntheticLambda10
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$getSortedCustomAttributes$0;
                lambda$getSortedCustomAttributes$0 = SessionReportingCoordinator.lambda$getSortedCustomAttributes$0((CrashlyticsReport.CustomAttribute) obj, (CrashlyticsReport.CustomAttribute) obj2);
                return lambda$getSortedCustomAttributes$0;
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getSortedCustomAttributes$0(CrashlyticsReport.CustomAttribute customAttribute, CrashlyticsReport.CustomAttribute customAttribute2) {
        return customAttribute.getKey().compareTo(customAttribute2.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onReportSendComplete(Task task) {
        if (!task.isSuccessful()) {
            Logger.getLogger().w("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) task.getResult();
        Logger.getLogger().d("Crashlytics report successfully enqueued to DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
        File reportFile = crashlyticsReportWithSessionId.getReportFile();
        if (reportFile.delete()) {
            Logger.getLogger().d("Deleted report file: " + reportFile.getPath());
            return true;
        }
        Logger.getLogger().w("Crashlytics could not delete report file: " + reportFile.getPath());
        return true;
    }

    private void persistEvent(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        this.reportPersistence.persistEvent(addMetaDataToEvent(this.dataCapture.captureEventData(th, thread, str2, j, 4, 8, z)), str, str2.equals("crash"));
    }

    public void finalizeSessionWithNativeEvent(String str, List list, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        Logger.getLogger().d("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CrashlyticsReport.FilesPayload.File asFilePayload = ((NativeSessionFile) it.next()).asFilePayload();
            if (asFilePayload != null) {
                arrayList.add(asFilePayload);
            }
        }
        this.reportPersistence.finalizeSessionWithNativeEvent(str, CrashlyticsReport.FilesPayload.builder().setFiles(Collections.unmodifiableList(arrayList)).build(), applicationExitInfo);
    }

    public void finalizeSessions(long j, String str) {
        this.reportPersistence.finalizeReports(str, j);
    }

    public boolean hasReportsToSend() {
        return this.reportPersistence.hasFinalizedReports();
    }

    public SortedSet listSortedOpenSessionIds() {
        return this.reportPersistence.getOpenSessionIds();
    }

    public void onBeginSession(String str, long j) {
        this.reportPersistence.persistReport(this.dataCapture.captureReportData(str, j));
    }

    public void persistFatalEvent(Throwable th, Thread thread, String str, long j) {
        Logger.getLogger().v("Persisting fatal event for session " + str);
        persistEvent(th, thread, str, "crash", j, true);
    }

    public void persistNonFatalEvent(Throwable th, Thread thread, String str, long j) {
        Logger.getLogger().v("Persisting non-fatal event for session " + str);
        persistEvent(th, thread, str, "error", j, false);
    }

    public void persistRelevantAppExitInfoEvent(String str, List list, LogFileManager logFileManager, UserMetadata userMetadata) {
        ApplicationExitInfo findRelevantApplicationExitInfo = findRelevantApplicationExitInfo(str, list);
        if (findRelevantApplicationExitInfo == null) {
            Logger.getLogger().v("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        CrashlyticsReport.Session.Event captureAnrEventData = this.dataCapture.captureAnrEventData(convertApplicationExitInfo(findRelevantApplicationExitInfo));
        Logger.getLogger().d("Persisting anr for session " + str);
        this.reportPersistence.persistEvent(addRolloutsStateToEvent(addLogsAndCustomKeysToEvent(captureAnrEventData, logFileManager, userMetadata), userMetadata), str, true);
    }

    public void removeAllReports() {
        this.reportPersistence.deleteAllReports();
    }

    public Task sendReports(Executor executor) {
        return sendReports(executor, null);
    }

    public Task sendReports(Executor executor, String str) {
        List<CrashlyticsReportWithSessionId> loadFinalizedReports = this.reportPersistence.loadFinalizedReports();
        ArrayList arrayList = new ArrayList();
        for (CrashlyticsReportWithSessionId crashlyticsReportWithSessionId : loadFinalizedReports) {
            if (str == null || str.equals(crashlyticsReportWithSessionId.getSessionId())) {
                arrayList.add(this.reportsSender.enqueueReport(ensureHasFid(crashlyticsReportWithSessionId), str != null).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator$$ExternalSyntheticLambda11
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        boolean onReportSendComplete;
                        onReportSendComplete = SessionReportingCoordinator.this.onReportSendComplete(task);
                        return Boolean.valueOf(onReportSendComplete);
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
