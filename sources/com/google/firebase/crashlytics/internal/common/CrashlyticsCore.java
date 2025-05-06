package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class CrashlyticsCore {
    private final AnalyticsEventLogger analyticsEventLogger;
    private final FirebaseApp app;
    private final CrashlyticsBackgroundWorker backgroundWorker;
    public final BreadcrumbSource breadcrumbSource;
    private final Context context;
    private CrashlyticsController controller;
    private final ExecutorService crashHandlerExecutor;
    private CrashlyticsFileMarker crashMarker;
    private final DataCollectionArbiter dataCollectionArbiter;
    private boolean didCrashOnPreviousExecution;
    private final FileStore fileStore;
    private final IdManager idManager;
    private CrashlyticsFileMarker initializationMarker;
    private final CrashlyticsNativeComponent nativeComponent;
    private final RemoteConfigDeferredProxy remoteConfigDeferredProxy;
    private final CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final long startTime = System.currentTimeMillis();
    private final OnDemandCounter onDemandCounter = new OnDemandCounter();

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, FileStore fileStore, ExecutorService executorService, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, RemoteConfigDeferredProxy remoteConfigDeferredProxy) {
        this.app = firebaseApp;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.context = firebaseApp.getApplicationContext();
        this.idManager = idManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.breadcrumbSource = breadcrumbSource;
        this.analyticsEventLogger = analyticsEventLogger;
        this.crashHandlerExecutor = executorService;
        this.fileStore = fileStore;
        this.backgroundWorker = new CrashlyticsBackgroundWorker(executorService);
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
        this.remoteConfigDeferredProxy = remoteConfigDeferredProxy;
    }

    private void checkForPreviousCrash() {
        boolean z;
        try {
            z = Boolean.TRUE.equals((Boolean) Utils.awaitEvenIfOnMainThread(this.backgroundWorker.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore.4
                @Override // java.util.concurrent.Callable
                public Boolean call() {
                    return Boolean.valueOf(CrashlyticsCore.this.controller.didCrashOnPreviousExecution());
                }
            })));
        } catch (Exception unused) {
            z = false;
        }
        this.didCrashOnPreviousExecution = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task doBackgroundInitialization(SettingsProvider settingsProvider) {
        markInitializationStarted();
        try {
            this.breadcrumbSource.registerBreadcrumbHandler(new BreadcrumbHandler() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda0
            });
            this.controller.saveVersionControlInfo();
            if (!settingsProvider.getSettingsSync().featureFlagData.collectReports) {
                Logger.getLogger().d("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.controller.finalizeSessions(settingsProvider)) {
                Logger.getLogger().w("Previous sessions could not be finalized.");
            }
            return this.controller.submitAllReports(settingsProvider.getSettingsAsync());
        } catch (Exception e) {
            Logger.getLogger().e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return Tasks.forException(e);
        } finally {
            markInitializationComplete();
        }
    }

    private void finishInitSynchronously(final SettingsProvider settingsProvider) {
        Logger logger;
        String str;
        Future<?> submit = this.crashHandlerExecutor.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore.2
            @Override // java.lang.Runnable
            public void run() {
                CrashlyticsCore.this.doBackgroundInitialization(settingsProvider);
            }
        });
        Logger.getLogger().d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            logger = Logger.getLogger();
            str = "Crashlytics was interrupted during initialization.";
            logger.e(str, e);
        } catch (ExecutionException e2) {
            e = e2;
            logger = Logger.getLogger();
            str = "Crashlytics encountered a problem during initialization.";
            logger.e(str, e);
        } catch (TimeoutException e3) {
            e = e3;
            logger = Logger.getLogger();
            str = "Crashlytics timed out during initialization.";
            logger.e(str, e);
        }
    }

    public static String getVersion() {
        return "18.6.0";
    }

    static boolean isBuildIdValid(String str, boolean z) {
        if (!z) {
            Logger.getLogger().v("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    public Task doBackgroundInitializationAsync(final SettingsProvider settingsProvider) {
        return Utils.callTask(this.crashHandlerExecutor, new Callable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore.1
            @Override // java.util.concurrent.Callable
            public Task call() {
                return CrashlyticsCore.this.doBackgroundInitialization(settingsProvider);
            }
        });
    }

    public void logException(Throwable th) {
        this.controller.writeNonFatalException(Thread.currentThread(), th);
    }

    void markInitializationComplete() {
        this.backgroundWorker.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore.3
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                try {
                    boolean remove = CrashlyticsCore.this.initializationMarker.remove();
                    if (!remove) {
                        Logger.getLogger().w("Initialization marker file was not properly removed.");
                    }
                    return Boolean.valueOf(remove);
                } catch (Exception e) {
                    Logger.getLogger().e("Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            }
        });
    }

    void markInitializationStarted() {
        this.backgroundWorker.checkRunningOnThread();
        this.initializationMarker.create();
        Logger.getLogger().v("Initialization marker file was created.");
    }

    public boolean onPreExecute(AppData appData, SettingsProvider settingsProvider) {
        if (!isBuildIdValid(appData.buildId, CommonUtils.getBooleanResourceValue(this.context, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String clsuuid = new CLSUUID(this.idManager).toString();
        try {
            this.crashMarker = new CrashlyticsFileMarker("crash_marker", this.fileStore);
            this.initializationMarker = new CrashlyticsFileMarker("initialization_marker", this.fileStore);
            UserMetadata userMetadata = new UserMetadata(clsuuid, this.fileStore, this.backgroundWorker);
            LogFileManager logFileManager = new LogFileManager(this.fileStore);
            MiddleOutFallbackStrategy middleOutFallbackStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
            this.remoteConfigDeferredProxy.setupListener(userMetadata);
            this.controller = new CrashlyticsController(this.context, this.backgroundWorker, this.idManager, this.dataCollectionArbiter, this.fileStore, this.crashMarker, appData, userMetadata, logFileManager, SessionReportingCoordinator.create(this.context, this.idManager, this.fileStore, appData, logFileManager, userMetadata, middleOutFallbackStrategy, settingsProvider, this.onDemandCounter, this.sessionsSubscriber), this.nativeComponent, this.analyticsEventLogger, this.sessionsSubscriber);
            boolean didPreviousInitializationFail = didPreviousInitializationFail();
            checkForPreviousCrash();
            this.controller.enableExceptionHandling(clsuuid, Thread.getDefaultUncaughtExceptionHandler(), settingsProvider);
            if (!didPreviousInitializationFail || !CommonUtils.canTryConnection(this.context)) {
                Logger.getLogger().d("Successfully configured exception handler.");
                return true;
            }
            Logger.getLogger().d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            finishInitSynchronously(settingsProvider);
            return false;
        } catch (Exception e) {
            Logger.getLogger().e("Crashlytics was not started due to an exception during initialization", e);
            this.controller = null;
            return false;
        }
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.dataCollectionArbiter.setCrashlyticsDataCollectionEnabled(bool);
    }

    public void setCustomKey(String str, String str2) {
        this.controller.setCustomKey(str, str2);
    }

    public void setUserId(String str) {
        this.controller.setUserId(str);
    }
}
