package com.microsoft.appcenter.distribute;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.gms.cast.framework.media.internal.zzo$$ExternalSyntheticApiModelOutline2;
import com.google.android.search.verification.client.SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2;
import com.microsoft.appcenter.AbstractAppCenterService;
import com.microsoft.appcenter.DependencyConfiguration;
import com.microsoft.appcenter.distribute.channel.DistributeInfoTracker;
import com.microsoft.appcenter.distribute.download.ReleaseDownloader;
import com.microsoft.appcenter.distribute.download.ReleaseDownloaderFactory;
import com.microsoft.appcenter.distribute.ingestion.models.DistributionStartSessionLog;
import com.microsoft.appcenter.distribute.ingestion.models.json.DistributionStartSessionLogFactory;
import com.microsoft.appcenter.http.HttpClient;
import com.microsoft.appcenter.http.HttpException;
import com.microsoft.appcenter.http.HttpResponse;
import com.microsoft.appcenter.http.HttpUtils;
import com.microsoft.appcenter.http.ServiceCall;
import com.microsoft.appcenter.http.ServiceCallback;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.microsoft.appcenter.utils.AppNameHelper;
import com.microsoft.appcenter.utils.DeviceInfoHelper;
import com.microsoft.appcenter.utils.HandlerUtils;
import com.microsoft.appcenter.utils.IdHelper;
import com.microsoft.appcenter.utils.NetworkStateHelper;
import com.microsoft.appcenter.utils.context.SessionContext;
import com.microsoft.appcenter.utils.crypto.CryptoUtils;
import com.microsoft.appcenter.utils.storage.SharedPreferencesManager;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.telegram.tgnet.TLObject;

/* loaded from: classes3.dex */
public class Distribute extends AbstractAppCenterService {
    private static Distribute sInstance;
    private String mAppSecret;
    private boolean mAutomaticCheckForUpdateDisabled;
    private String mBeforeStartDistributionGroupId;
    private String mBeforeStartRequestId;
    private String mBeforeStartTesterAppUpdateSetupFailed;
    private String mBeforeStartUpdateSetupFailed;
    private String mBeforeStartUpdateToken;
    private boolean mBrowserOpenedOrAborted;
    private ServiceCall mCheckReleaseApiCall;
    private Object mCheckReleaseCallId;
    private boolean mCheckedDownload;
    private Dialog mCompletedDownloadDialog;
    private Context mContext;
    private DistributeInfoTracker mDistributeInfoTracker;
    private boolean mEnabledForDebuggableBuild;
    private final Map mFactories;
    private Activity mForegroundActivity;
    private boolean mManualCheckForUpdateRequested;
    private PackageInfo mPackageInfo;
    private ReleaseDetails mReleaseDetails;
    private ReleaseDownloader mReleaseDownloader;
    private ReleaseDownloadListener mReleaseDownloaderListener;
    private boolean mTesterAppOpenedOrAborted;
    private Dialog mUnknownSourcesDialog;
    private Dialog mUpdateDialog;
    private Dialog mUpdateSetupFailedDialog;
    private Boolean mUsingDefaultUpdateDialog;
    private boolean mWorkflowCompleted;
    private String mInstallUrl = "https://install.appcenter.ms";
    private String mApiUrl = "https://api.appcenter.ms/v0.1";
    private int mUpdateTrack = 1;
    private WeakReference mLastActivityWithDialog = new WeakReference(null);

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected int getTriggerCount() {
        return 1;
    }

    private Distribute() {
        HashMap hashMap = new HashMap();
        this.mFactories = hashMap;
        hashMap.put("distributionStartSession", new DistributionStartSessionLogFactory());
    }

    public static synchronized Distribute getInstance() {
        Distribute distribute;
        synchronized (Distribute.class) {
            try {
                if (sInstance == null) {
                    sInstance = new Distribute();
                }
                distribute = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return distribute;
    }

    public static void setEnabledForDebuggableBuild(boolean z) {
        getInstance().setInstanceEnabledForDebuggableBuild(z);
    }

    public static void checkForUpdate() {
        getInstance().instanceCheckForUpdate();
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected String getGroupName() {
        return "group_distribute";
    }

    @Override // com.microsoft.appcenter.AppCenterService
    public String getServiceName() {
        return "Distribute";
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected String getLoggerTag() {
        return "AppCenterDistribute";
    }

    @Override // com.microsoft.appcenter.AppCenterService
    public Map getLogFactories() {
        return this.mFactories;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x002f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.microsoft.appcenter.AbstractAppCenterService, com.microsoft.appcenter.AppCenterService
    public synchronized void onStarted(android.content.Context r4, com.microsoft.appcenter.channel.Channel r5, java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mContext = r4     // Catch: java.lang.Throwable -> L2a
            r3.mAppSecret = r6     // Catch: java.lang.Throwable -> L2a
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L17 android.content.pm.PackageManager.NameNotFoundException -> L1c
            android.content.Context r1 = r3.mContext     // Catch: java.lang.Throwable -> L17 android.content.pm.PackageManager.NameNotFoundException -> L1c
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L17 android.content.pm.PackageManager.NameNotFoundException -> L1c
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L17 android.content.pm.PackageManager.NameNotFoundException -> L1c
            r3.mPackageInfo = r0     // Catch: java.lang.Throwable -> L17 android.content.pm.PackageManager.NameNotFoundException -> L1c
            goto L24
        L17:
            r0 = move-exception
            r4 = r0
            r5 = r4
            r4 = r3
            goto L2d
        L1c:
            r0 = move-exception
            java.lang.String r1 = "AppCenterDistribute"
            java.lang.String r2 = "Could not get self package info."
            com.microsoft.appcenter.utils.AppCenterLog.error(r1, r2, r0)     // Catch: java.lang.Throwable -> L2a
        L24:
            super.onStarted(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2a
            r4 = r3
            monitor-exit(r3)
            return
        L2a:
            r0 = move-exception
            r4 = r3
        L2c:
            r5 = r0
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r5
        L2f:
            r0 = move-exception
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.distribute.Distribute.onStarted(android.content.Context, com.microsoft.appcenter.channel.Channel, java.lang.String, java.lang.String, boolean):void");
    }

    synchronized void startFromBackground(Context context) {
        if (this.mAppSecret == null) {
            AppCenterLog.debug("AppCenterDistribute", "Called before onStart, init storage");
            this.mContext = context;
            SharedPreferencesManager.initialize(context);
            updateReleaseDetails(DistributeUtils.loadCachedReleaseDetails());
        }
    }

    private boolean tryResetWorkflow() {
        if (DistributeUtils.getStoredDownloadState() != 0 || this.mCheckReleaseCallId != null) {
            return false;
        }
        this.mWorkflowCompleted = false;
        this.mBrowserOpenedOrAborted = false;
        return true;
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService, android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        this.mForegroundActivity = activity;
        if (this.mChannel != null) {
            resumeDistributeWorkflow();
        }
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService, android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        this.mForegroundActivity = null;
        ReleaseDownloadListener releaseDownloadListener = this.mReleaseDownloaderListener;
        if (releaseDownloadListener != null) {
            releaseDownloadListener.hideProgressDialog();
        }
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService, com.microsoft.appcenter.utils.ApplicationLifecycleListener.ApplicationLifecycleCallbacks
    public void onApplicationEnterForeground() {
        if (this.mChannel != null) {
            AppCenterLog.debug("AppCenterDistribute", "Resetting workflow on entering foreground.");
            tryResetWorkflow();
        }
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected synchronized void applyEnabledState(boolean z) {
        try {
            if (z) {
                changeDistributionGroupIdAfterAppUpdateIfNeeded();
                DistributeInfoTracker distributeInfoTracker = new DistributeInfoTracker(SharedPreferencesManager.getString("Distribute.distribution_group_id"));
                this.mDistributeInfoTracker = distributeInfoTracker;
                this.mChannel.addListener(distributeInfoTracker);
                resumeWorkflowIfForeground();
            } else {
                this.mTesterAppOpenedOrAborted = false;
                this.mBrowserOpenedOrAborted = false;
                this.mWorkflowCompleted = false;
                cancelPreviousTasks();
                SharedPreferencesManager.remove("Distribute.request_id");
                SharedPreferencesManager.remove("Distribute.postpone_time");
                SharedPreferencesManager.remove("Distribute.update_setup_failed_package_hash");
                SharedPreferencesManager.remove("Distribute.update_setup_failed_message");
                SharedPreferencesManager.remove("Distribute.tester_app_update_setup_failed_message");
                this.mChannel.removeListener(this.mDistributeInfoTracker);
                this.mDistributeInfoTracker = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void resumeWorkflowIfForeground() {
        if (this.mForegroundActivity != null) {
            HandlerUtils.runOnUiThread(new Runnable() { // from class: com.microsoft.appcenter.distribute.Distribute.1
                @Override // java.lang.Runnable
                public void run() {
                    Distribute.this.resumeDistributeWorkflow();
                }
            });
        } else {
            AppCenterLog.debug("AppCenterDistribute", "Distribute workflow will be resumed on activity resume event.");
        }
    }

    private synchronized void setInstanceEnabledForDebuggableBuild(boolean z) {
        this.mEnabledForDebuggableBuild = z;
    }

    private void instanceCheckForUpdate() {
        post(new Runnable() { // from class: com.microsoft.appcenter.distribute.Distribute.3
            @Override // java.lang.Runnable
            public void run() {
                Distribute.this.handleCheckForUpdate();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handleCheckForUpdate() {
        try {
            this.mManualCheckForUpdateRequested = true;
            if (tryResetWorkflow()) {
                resumeWorkflowIfForeground();
            } else {
                AppCenterLog.info("AppCenterDistribute", "A check for update is already ongoing.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void cancelPreviousTasks() {
        try {
            ServiceCall serviceCall = this.mCheckReleaseApiCall;
            if (serviceCall != null) {
                serviceCall.cancel();
                this.mCheckReleaseApiCall = null;
            }
            this.mCheckReleaseCallId = null;
            this.mUpdateDialog = null;
            this.mUnknownSourcesDialog = null;
            this.mCompletedDownloadDialog = null;
            this.mUpdateSetupFailedDialog = null;
            this.mLastActivityWithDialog.clear();
            this.mUsingDefaultUpdateDialog = null;
            this.mCheckedDownload = false;
            this.mManualCheckForUpdateRequested = false;
            updateReleaseDetails(null);
            SharedPreferencesManager.remove("Distribute.release_details");
            SharedPreferencesManager.remove("Distribute.download_state");
            SharedPreferencesManager.remove("Distribute.download_time");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void resumeDistributeWorkflow() {
        String string;
        AppCenterLog.debug("AppCenterDistribute", "Resume distribute workflow...");
        if (this.mPackageInfo != null && this.mForegroundActivity != null && !this.mWorkflowCompleted && isInstanceEnabled()) {
            if ((this.mContext.getApplicationInfo().flags & 2) == 2 && !this.mEnabledForDebuggableBuild) {
                AppCenterLog.info("AppCenterDistribute", "Not checking for in-app updates in debuggable build.");
                this.mWorkflowCompleted = true;
                this.mManualCheckForUpdateRequested = false;
                return;
            }
            if (InstallerUtils.isInstalledFromAppStore("AppCenterDistribute", this.mContext)) {
                AppCenterLog.info("AppCenterDistribute", "Not checking in app updates as installed from a store.");
                this.mWorkflowCompleted = true;
                this.mManualCheckForUpdateRequested = false;
                return;
            }
            boolean z = this.mUpdateTrack == 1;
            if (!z && (string = SharedPreferencesManager.getString("Distribute.update_setup_failed_package_hash")) != null) {
                if (DistributeUtils.computeReleaseHash(this.mPackageInfo).equals(string)) {
                    AppCenterLog.info("AppCenterDistribute", "Skipping in-app updates setup, because it already failed on this release before.");
                    return;
                }
                AppCenterLog.info("AppCenterDistribute", "Re-attempting in-app updates setup and cleaning up failure info from storage.");
                SharedPreferencesManager.remove("Distribute.update_setup_failed_package_hash");
                SharedPreferencesManager.remove("Distribute.update_setup_failed_message");
                SharedPreferencesManager.remove("Distribute.tester_app_update_setup_failed_message");
            }
            String str = null;
            if (this.mBeforeStartRequestId != null) {
                AppCenterLog.debug("AppCenterDistribute", "Processing redirection parameters we kept in memory before onStarted");
                String str2 = this.mBeforeStartDistributionGroupId;
                if (str2 != null) {
                    storeRedirectionParameters(this.mBeforeStartRequestId, str2, this.mBeforeStartUpdateToken);
                } else {
                    String str3 = this.mBeforeStartUpdateSetupFailed;
                    if (str3 != null) {
                        storeUpdateSetupFailedParameter(this.mBeforeStartRequestId, str3);
                    }
                }
                String str4 = this.mBeforeStartTesterAppUpdateSetupFailed;
                if (str4 != null) {
                    storeTesterAppUpdateSetupFailedParameter(this.mBeforeStartRequestId, str4);
                }
                this.mBeforeStartRequestId = null;
                this.mBeforeStartDistributionGroupId = null;
                this.mBeforeStartUpdateToken = null;
                this.mBeforeStartUpdateSetupFailed = null;
                this.mBeforeStartTesterAppUpdateSetupFailed = null;
                return;
            }
            int storedDownloadState = DistributeUtils.getStoredDownloadState();
            if (this.mReleaseDetails == null && storedDownloadState != 0) {
                updateReleaseDetails(DistributeUtils.loadCachedReleaseDetails());
                ReleaseDetails releaseDetails = this.mReleaseDetails;
                if (releaseDetails != null && !releaseDetails.isMandatoryUpdate() && NetworkStateHelper.getSharedInstance(this.mContext).isNetworkConnected() && storedDownloadState == 1) {
                    cancelPreviousTasks();
                }
            }
            if (storedDownloadState != 0 && storedDownloadState != 1 && !this.mCheckedDownload) {
                if (this.mPackageInfo.lastUpdateTime > SharedPreferencesManager.getLong("Distribute.download_time")) {
                    AppCenterLog.debug("AppCenterDistribute", "Discarding previous download as application updated.");
                    cancelPreviousTasks();
                } else {
                    this.mCheckedDownload = true;
                    resumeDownload();
                    ReleaseDetails releaseDetails2 = this.mReleaseDetails;
                    if (releaseDetails2 == null || !releaseDetails2.isMandatoryUpdate() || storedDownloadState != 2) {
                        return;
                    }
                }
            }
            ReleaseDetails releaseDetails3 = this.mReleaseDetails;
            if (releaseDetails3 != null) {
                if (storedDownloadState == 4) {
                    showMandatoryDownloadReadyDialog();
                } else if (storedDownloadState == 2) {
                    resumeDownload();
                    showDownloadProgress();
                } else if (this.mUnknownSourcesDialog != null) {
                    enqueueDownloadOrShowUnknownSourcesDialog(releaseDetails3);
                } else {
                    ReleaseDownloader releaseDownloader = this.mReleaseDownloader;
                    if (releaseDownloader == null || !releaseDownloader.isDownloading()) {
                        showUpdateDialog();
                    }
                }
                if (storedDownloadState != 1 && storedDownloadState != 4) {
                    return;
                }
            }
            if (SharedPreferencesManager.getString("Distribute.update_setup_failed_message") != null) {
                AppCenterLog.debug("AppCenterDistribute", "In-app updates setup failure detected.");
                showUpdateSetupFailedDialog();
                return;
            }
            if (this.mCheckReleaseCallId != null) {
                AppCenterLog.verbose("AppCenterDistribute", "Already checking or checked latest release.");
                return;
            }
            if (this.mAutomaticCheckForUpdateDisabled && !this.mManualCheckForUpdateRequested) {
                AppCenterLog.debug("AppCenterDistribute", "Automatic check for update is disabled. The SDK will not check for update now.");
                return;
            }
            String string2 = SharedPreferencesManager.getString("Distribute.update_token");
            String string3 = SharedPreferencesManager.getString("Distribute.distribution_group_id");
            if (!z && string2 == null) {
                String string4 = SharedPreferencesManager.getString("Distribute.tester_app_update_setup_failed_message");
                if (isAppCenterTesterAppInstalled() && TextUtils.isEmpty(string4) && !this.mContext.getPackageName().equals("com.microsoft.hockeyapp.testerapp") && !this.mTesterAppOpenedOrAborted) {
                    DistributeUtils.updateSetupUsingTesterApp(this.mForegroundActivity, this.mPackageInfo);
                    this.mTesterAppOpenedOrAborted = true;
                } else if (!this.mBrowserOpenedOrAborted) {
                    DistributeUtils.updateSetupUsingBrowser(this.mForegroundActivity, this.mInstallUrl, this.mAppSecret, this.mPackageInfo);
                    this.mBrowserOpenedOrAborted = true;
                }
            }
            str = string2;
            decryptAndGetReleaseDetails(str, string3);
        }
    }

    private boolean isAppCenterTesterAppInstalled() {
        try {
            this.mContext.getPackageManager().getPackageInfo("com.microsoft.hockeyapp.testerapp", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private void decryptAndGetReleaseDetails(String str, String str2) {
        if (str != null) {
            CryptoUtils.DecryptedData decrypt = CryptoUtils.getInstance(this.mContext).decrypt(str);
            String newEncryptedData = decrypt.getNewEncryptedData();
            if (newEncryptedData != null) {
                SharedPreferencesManager.putString("Distribute.update_token", newEncryptedData);
            }
            str = decrypt.getDecryptedData();
        }
        getLatestReleaseDetails(str2, str);
    }

    synchronized void completeWorkflow(ReleaseDetails releaseDetails) {
        if (releaseDetails == this.mReleaseDetails) {
            completeWorkflow();
        }
    }

    private synchronized void cancelNotification() {
        if (DistributeUtils.getStoredDownloadState() == 3) {
            AppCenterLog.debug("AppCenterDistribute", "Delete notification");
            ((NotificationManager) this.mContext.getSystemService("notification")).cancel(DistributeUtils.getNotificationId());
        }
    }

    synchronized void completeWorkflow() {
        try {
            cancelNotification();
            SharedPreferencesManager.remove("Distribute.release_details");
            SharedPreferencesManager.remove("Distribute.download_state");
            this.mCheckReleaseApiCall = null;
            this.mCheckReleaseCallId = null;
            this.mUpdateDialog = null;
            this.mUpdateSetupFailedDialog = null;
            this.mUnknownSourcesDialog = null;
            this.mLastActivityWithDialog.clear();
            this.mReleaseDetails = null;
            ReleaseDownloadListener releaseDownloadListener = this.mReleaseDownloaderListener;
            if (releaseDownloadListener != null) {
                releaseDownloadListener.hideProgressDialog();
            }
            this.mWorkflowCompleted = true;
            this.mManualCheckForUpdateRequested = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void storeUpdateSetupFailedParameter(String str, String str2) {
        try {
            if (this.mContext == null) {
                AppCenterLog.debug("AppCenterDistribute", "Update setup failed parameter received before onStart, keep it in memory.");
                this.mBeforeStartRequestId = str;
                this.mBeforeStartUpdateSetupFailed = str2;
            } else if (str.equals(SharedPreferencesManager.getString("Distribute.request_id"))) {
                AppCenterLog.debug("AppCenterDistribute", "Stored update setup failed parameter.");
                SharedPreferencesManager.putString("Distribute.update_setup_failed_message", str2);
            } else {
                AppCenterLog.warn("AppCenterDistribute", "Ignoring redirection parameters as requestId is invalid.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void storeTesterAppUpdateSetupFailedParameter(String str, String str2) {
        try {
            if (this.mContext == null) {
                AppCenterLog.debug("AppCenterDistribute", "Tester app update setup failed parameter received before onStart, keep it in memory.");
                this.mBeforeStartRequestId = str;
                this.mBeforeStartTesterAppUpdateSetupFailed = str2;
            } else if (str.equals(SharedPreferencesManager.getString("Distribute.request_id"))) {
                AppCenterLog.debug("AppCenterDistribute", "Stored tester app update setup failed parameter.");
                SharedPreferencesManager.putString("Distribute.tester_app_update_setup_failed_message", str2);
            } else {
                AppCenterLog.warn("AppCenterDistribute", "Ignoring redirection parameters as requestId is invalid.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void storeRedirectionParameters(String str, String str2, String str3) {
        try {
            if (this.mContext == null) {
                AppCenterLog.debug("AppCenterDistribute", "Redirection parameters received before onStart, keep them in memory.");
                this.mBeforeStartRequestId = str;
                this.mBeforeStartUpdateToken = str3;
                this.mBeforeStartDistributionGroupId = str2;
            } else if (str.equals(SharedPreferencesManager.getString("Distribute.request_id"))) {
                if (str3 != null) {
                    SharedPreferencesManager.putString("Distribute.update_token", CryptoUtils.getInstance(this.mContext).encrypt(str3));
                } else {
                    SharedPreferencesManager.remove("Distribute.update_token");
                }
                SharedPreferencesManager.remove("Distribute.request_id");
                processDistributionGroupId(str2);
                AppCenterLog.debug("AppCenterDistribute", "Stored redirection parameters.");
                cancelPreviousTasks();
                getLatestReleaseDetails(str2, str3);
            } else {
                AppCenterLog.warn("AppCenterDistribute", "Ignoring redirection parameters as requestId is invalid.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void processDistributionGroupId(String str) {
        SharedPreferencesManager.putString("Distribute.distribution_group_id", str);
        this.mDistributeInfoTracker.updateDistributionGroupId(str);
        enqueueDistributionStartSessionLog();
    }

    synchronized void getLatestReleaseDetails(final String str, String str2) {
        String str3;
        try {
            AppCenterLog.debug("AppCenterDistribute", "Get latest release details...");
            HttpClient httpClient = DependencyConfiguration.getHttpClient();
            if (httpClient == null) {
                httpClient = HttpUtils.createHttpClient(this.mContext);
            }
            String computeReleaseHash = DistributeUtils.computeReleaseHash(this.mPackageInfo);
            String str4 = this.mApiUrl;
            if (str2 == null) {
                str3 = str4 + String.format("/public/sdk/apps/%s/releases/latest?release_hash=%s%s", this.mAppSecret, computeReleaseHash, getReportingParametersForUpdatedRelease(true, str));
            } else {
                str3 = str4 + String.format("/sdk/apps/%s/releases/private/latest?release_hash=%s%s", this.mAppSecret, computeReleaseHash, getReportingParametersForUpdatedRelease(false, str));
            }
            String str5 = str3;
            HashMap hashMap = new HashMap();
            if (str2 != null) {
                hashMap.put("x-api-token", str2);
            }
            final Object obj = new Object();
            this.mCheckReleaseCallId = obj;
            this.mCheckReleaseApiCall = httpClient.callAsync(str5, "GET", hashMap, new HttpClient.CallTemplate() { // from class: com.microsoft.appcenter.distribute.Distribute.4
                @Override // com.microsoft.appcenter.http.HttpClient.CallTemplate
                public String buildRequestBody() {
                    return null;
                }

                @Override // com.microsoft.appcenter.http.HttpClient.CallTemplate
                public void onBeforeCalling(URL url, Map map) {
                    if (AppCenterLog.getLogLevel() <= 2) {
                        AppCenterLog.verbose("AppCenterDistribute", "Calling " + url.toString().replaceAll(Distribute.this.mAppSecret, HttpUtils.hideSecret(Distribute.this.mAppSecret)) + "...");
                        HashMap hashMap2 = new HashMap(map);
                        String str6 = (String) hashMap2.get("x-api-token");
                        if (str6 != null) {
                            hashMap2.put("x-api-token", HttpUtils.hideSecret(str6));
                        }
                        AppCenterLog.verbose("AppCenterDistribute", "Headers: " + hashMap2);
                    }
                }
            }, new ServiceCallback() { // from class: com.microsoft.appcenter.distribute.Distribute.5
                @Override // com.microsoft.appcenter.http.ServiceCallback
                public void onCallSucceeded(HttpResponse httpResponse) {
                    try {
                        String payload = httpResponse.getPayload();
                        Distribute.this.handleApiCallSuccess(obj, payload, ReleaseDetails.parse(payload), str);
                    } catch (JSONException e) {
                        onCallFailed(e);
                    }
                }

                @Override // com.microsoft.appcenter.http.ServiceCallback
                public void onCallFailed(Exception exc) {
                    Distribute.this.handleApiCallFailure(obj, exc);
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handleApiCallFailure(Object obj, Exception exc) {
        String str;
        if (this.mCheckReleaseCallId == obj) {
            completeWorkflow();
            if (!HttpUtils.isRecoverableError(exc)) {
                if (exc instanceof HttpException) {
                    try {
                        str = ErrorDetails.parse(((HttpException) exc).getHttpResponse().getPayload()).getCode();
                    } catch (JSONException e) {
                        AppCenterLog.verbose("AppCenterDistribute", "Cannot read the error as JSON", e);
                        str = null;
                    }
                    if ("no_releases_for_user".equals(str)) {
                        AppCenterLog.info("AppCenterDistribute", "No release available to the current user.");
                    } else {
                        AppCenterLog.error("AppCenterDistribute", "Failed to check latest release (delete setup state)", exc);
                        SharedPreferencesManager.remove("Distribute.distribution_group_id");
                        SharedPreferencesManager.remove("Distribute.update_token");
                        SharedPreferencesManager.remove("Distribute.postpone_time");
                        this.mDistributeInfoTracker.removeDistributionGroupId();
                    }
                } else {
                    AppCenterLog.error("AppCenterDistribute", "Failed to check latest release", exc);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handleApiCallSuccess(Object obj, String str, ReleaseDetails releaseDetails, String str2) {
        try {
            String string = SharedPreferencesManager.getString("Distribute.downloaded_release_hash");
            if (!TextUtils.isEmpty(string)) {
                if (isCurrentReleaseWasUpdated(string)) {
                    AppCenterLog.debug("AppCenterDistribute", "Successfully reported app update for downloaded release hash (" + string + "), removing from store..");
                    SharedPreferencesManager.remove("Distribute.downloaded_release_hash");
                    SharedPreferencesManager.remove("Distribute.downloaded_release_id");
                } else {
                    AppCenterLog.debug("AppCenterDistribute", "Stored release hash doesn't match current installation, probably downloaded but not installed yet, keep in store");
                }
            }
            if (this.mCheckReleaseCallId == obj) {
                this.mCheckReleaseApiCall = null;
                if (str2 == null) {
                    processDistributionGroupId(releaseDetails.getDistributionGroupId());
                }
                if (Build.VERSION.SDK_INT >= releaseDetails.getMinApiLevel()) {
                    AppCenterLog.debug("AppCenterDistribute", "Check if latest release is more recent.");
                    if (isMoreRecent(releaseDetails) && canUpdateNow(releaseDetails)) {
                        if (this.mReleaseDetails == null) {
                            updateReleaseDetails(DistributeUtils.loadCachedReleaseDetails());
                        }
                        SharedPreferencesManager.putString("Distribute.release_details", str);
                        ReleaseDetails releaseDetails2 = this.mReleaseDetails;
                        if (releaseDetails2 != null && releaseDetails2.isMandatoryUpdate()) {
                            if (this.mReleaseDetails.getId() != releaseDetails.getId()) {
                                AppCenterLog.debug("AppCenterDistribute", "Latest release is more recent than the previous mandatory.");
                                SharedPreferencesManager.putInt("Distribute.download_state", 1);
                            } else {
                                AppCenterLog.debug("AppCenterDistribute", "The latest release is mandatory and already being processed.");
                            }
                            return;
                        }
                        updateReleaseDetails(releaseDetails);
                        AppCenterLog.debug("AppCenterDistribute", "Latest release is more recent.");
                        SharedPreferencesManager.putInt("Distribute.download_state", 1);
                        if (this.mForegroundActivity != null) {
                            showUpdateDialog();
                        }
                        return;
                    }
                } else {
                    AppCenterLog.info("AppCenterDistribute", "This device is not compatible with the latest release.");
                }
                completeWorkflow();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void updateReleaseDetails(ReleaseDetails releaseDetails) {
        try {
            if (this.mReleaseDownloader != null) {
                if (releaseDetails != null) {
                    if (releaseDetails.getId() != this.mReleaseDownloader.getReleaseDetails().getId()) {
                    }
                    this.mReleaseDownloader = null;
                }
                this.mReleaseDownloader.cancel();
                this.mReleaseDownloader = null;
            } else if (releaseDetails == null) {
                ReleaseDownloaderFactory.create(this.mContext, null, null).cancel();
            }
            ReleaseDownloadListener releaseDownloadListener = this.mReleaseDownloaderListener;
            if (releaseDownloadListener != null) {
                releaseDownloadListener.hideProgressDialog();
                this.mReleaseDownloaderListener = null;
            }
            this.mReleaseDetails = releaseDetails;
            if (releaseDetails != null) {
                ReleaseDownloadListener releaseDownloadListener2 = new ReleaseDownloadListener(this.mContext, releaseDetails);
                this.mReleaseDownloaderListener = releaseDownloadListener2;
                this.mReleaseDownloader = ReleaseDownloaderFactory.create(this.mContext, this.mReleaseDetails, releaseDownloadListener2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private String getReportingParametersForUpdatedRelease(boolean z, String str) {
        AppCenterLog.debug("AppCenterDistribute", "Check if we need to report release installation..");
        String string = SharedPreferencesManager.getString("Distribute.downloaded_release_hash");
        String str2 = "";
        if (!TextUtils.isEmpty(string)) {
            if (isCurrentReleaseWasUpdated(string)) {
                AppCenterLog.debug("AppCenterDistribute", "Current release was updated but not reported yet, reporting..");
                if (z) {
                    str2 = "&install_id=" + IdHelper.getInstallId();
                }
                return (str2 + "&distribution_group_id=" + str) + "&downloaded_release_id=" + SharedPreferencesManager.getInt("Distribute.downloaded_release_id");
            }
            AppCenterLog.debug("AppCenterDistribute", "New release was downloaded but not installed yet, skip reporting.");
            return "";
        }
        AppCenterLog.debug("AppCenterDistribute", "Current release was already reported, skip reporting.");
        return "";
    }

    private void changeDistributionGroupIdAfterAppUpdateIfNeeded() {
        String string = SharedPreferencesManager.getString("Distribute.downloaded_release_hash");
        String string2 = SharedPreferencesManager.getString("Distribute.downloaded_distribution_group_id");
        if (!isCurrentReleaseWasUpdated(string) || TextUtils.isEmpty(string2) || string2.equals(SharedPreferencesManager.getString("Distribute.distribution_group_id"))) {
            return;
        }
        AppCenterLog.debug("AppCenterDistribute", "Current group ID doesn't match the group ID of downloaded release, updating current group id=" + string2);
        SharedPreferencesManager.putString("Distribute.distribution_group_id", string2);
        SharedPreferencesManager.remove("Distribute.downloaded_distribution_group_id");
    }

    private boolean isCurrentReleaseWasUpdated(String str) {
        if (this.mPackageInfo == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return DistributeUtils.computeReleaseHash(this.mPackageInfo).equals(str);
    }

    private boolean isMoreRecent(ReleaseDetails releaseDetails) {
        boolean z;
        int versionCode = DeviceInfoHelper.getVersionCode(this.mPackageInfo);
        if (releaseDetails.getVersion() == versionCode) {
            z = !releaseDetails.getReleaseHash().equals(DistributeUtils.computeReleaseHash(this.mPackageInfo));
        } else {
            z = releaseDetails.getVersion() > versionCode;
        }
        AppCenterLog.debug("AppCenterDistribute", "Latest release more recent=" + z);
        return z;
    }

    private boolean canUpdateNow(ReleaseDetails releaseDetails) {
        if (releaseDetails.isMandatoryUpdate()) {
            AppCenterLog.debug("AppCenterDistribute", "Release is mandatory, ignoring any postpone action.");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = SharedPreferencesManager.getLong("Distribute.postpone_time", 0L);
        if (currentTimeMillis < j) {
            AppCenterLog.debug("AppCenterDistribute", "User clock has been changed in past, cleaning postpone state and showing dialog");
            SharedPreferencesManager.remove("Distribute.postpone_time");
            return true;
        }
        long j2 = j + 86400000;
        if (currentTimeMillis >= j2) {
            return true;
        }
        AppCenterLog.debug("AppCenterDistribute", "Optional updates are postponed until " + new Date(j2));
        return false;
    }

    private boolean shouldRefreshDialog(Dialog dialog) {
        if (dialog == null || !dialog.isShowing()) {
            return true;
        }
        if (this.mForegroundActivity == this.mLastActivityWithDialog.get()) {
            AppCenterLog.debug("AppCenterDistribute", "Previous dialog is still being shown in the same activity.");
            return false;
        }
        dialog.hide();
        return true;
    }

    private void showAndRememberDialogActivity(Dialog dialog) {
        dialog.show();
        this.mLastActivityWithDialog = new WeakReference(this.mForegroundActivity);
    }

    private synchronized void showUpdateDialog() {
        String string;
        try {
            if (this.mUsingDefaultUpdateDialog == null) {
                this.mUsingDefaultUpdateDialog = Boolean.TRUE;
            }
            if (this.mUsingDefaultUpdateDialog.booleanValue()) {
                if (!shouldRefreshDialog(this.mUpdateDialog)) {
                    return;
                }
                AppCenterLog.debug("AppCenterDistribute", "Show default update dialog.");
                AlertDialog.Builder builder = new AlertDialog.Builder(this.mForegroundActivity);
                builder.setTitle(R$string.appcenter_distribute_update_dialog_title);
                final ReleaseDetails releaseDetails = this.mReleaseDetails;
                if (releaseDetails.isMandatoryUpdate()) {
                    string = this.mContext.getString(R$string.appcenter_distribute_update_dialog_message_mandatory);
                } else {
                    string = this.mContext.getString(R$string.appcenter_distribute_update_dialog_message_optional);
                }
                builder.setMessage(formatAppNameAndVersion(string));
                builder.setPositiveButton(R$string.appcenter_distribute_update_dialog_download, new DialogInterface.OnClickListener() { // from class: com.microsoft.appcenter.distribute.Distribute.6
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Distribute.this.enqueueDownloadOrShowUnknownSourcesDialog(releaseDetails);
                    }
                });
                builder.setCancelable(false);
                if (!releaseDetails.isMandatoryUpdate()) {
                    builder.setNegativeButton(R$string.appcenter_distribute_update_dialog_postpone, new DialogInterface.OnClickListener() { // from class: com.microsoft.appcenter.distribute.Distribute.7
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Distribute.this.postponeRelease(releaseDetails);
                        }
                    });
                }
                if (!TextUtils.isEmpty(releaseDetails.getReleaseNotes()) && releaseDetails.getReleaseNotesUrl() != null) {
                    builder.setNeutralButton(R$string.appcenter_distribute_update_dialog_view_release_notes, new DialogInterface.OnClickListener() { // from class: com.microsoft.appcenter.distribute.Distribute.8
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Distribute.this.viewReleaseNotes(releaseDetails);
                        }
                    });
                }
                AlertDialog create = builder.create();
                this.mUpdateDialog = create;
                showAndRememberDialogActivity(create);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void viewReleaseNotes(ReleaseDetails releaseDetails) {
        try {
            this.mForegroundActivity.startActivity(new Intent("android.intent.action.VIEW", releaseDetails.getReleaseNotesUrl()));
        } catch (ActivityNotFoundException e) {
            AppCenterLog.error("AppCenterDistribute", "Failed to navigate to release notes.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void storeUpdateSetupFailedPackageHash(DialogInterface dialogInterface) {
        try {
            if (this.mUpdateSetupFailedDialog == dialogInterface) {
                SharedPreferencesManager.putString("Distribute.update_setup_failed_package_hash", DistributeUtils.computeReleaseHash(this.mPackageInfo));
            } else {
                showDisabledToast();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handleUpdateFailedDialogReinstallAction(DialogInterface dialogInterface) {
        if (this.mUpdateSetupFailedDialog == dialogInterface) {
            String str = this.mInstallUrl;
            try {
                str = BrowserUtils.appendUri(str, "update_setup_failed=true");
            } catch (URISyntaxException e) {
                AppCenterLog.error("AppCenterDistribute", "Could not append query parameter to url.", e);
            }
            BrowserUtils.openBrowser(str, this.mForegroundActivity);
            SharedPreferencesManager.remove("Distribute.update_setup_failed_package_hash");
            SharedPreferencesManager.remove("Distribute.tester_app_update_setup_failed_message");
        } else {
            showDisabledToast();
        }
    }

    private synchronized void showUnknownSourcesDialog() {
        try {
            if (shouldRefreshDialog(this.mUnknownSourcesDialog)) {
                AppCenterLog.debug("AppCenterDistribute", "Show new unknown sources dialog.");
                AlertDialog.Builder builder = new AlertDialog.Builder(this.mForegroundActivity);
                builder.setMessage(R$string.appcenter_distribute_unknown_sources_dialog_message);
                final ReleaseDetails releaseDetails = this.mReleaseDetails;
                if (releaseDetails.isMandatoryUpdate()) {
                    builder.setCancelable(false);
                } else {
                    builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.microsoft.appcenter.distribute.Distribute.9
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Distribute.this.completeWorkflow(releaseDetails);
                        }
                    });
                    builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.microsoft.appcenter.distribute.Distribute.10
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(DialogInterface dialogInterface) {
                            Distribute.this.completeWorkflow(releaseDetails);
                        }
                    });
                }
                builder.setPositiveButton(R$string.appcenter_distribute_unknown_sources_dialog_settings, new DialogInterface.OnClickListener() { // from class: com.microsoft.appcenter.distribute.Distribute.11
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Distribute.this.goToUnknownAppsSettings(releaseDetails);
                    }
                });
                AlertDialog create = builder.create();
                this.mUnknownSourcesDialog = create;
                showAndRememberDialogActivity(create);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void showUpdateSetupFailedDialog() {
        if (shouldRefreshDialog(this.mUpdateSetupFailedDialog)) {
            AppCenterLog.debug("AppCenterDistribute", "Show update setup failed dialog.");
            AlertDialog.Builder builder = new AlertDialog.Builder(this.mForegroundActivity);
            builder.setCancelable(false);
            builder.setTitle(R$string.appcenter_distribute_update_failed_dialog_title);
            builder.setMessage(R$string.appcenter_distribute_update_failed_dialog_message);
            builder.setPositiveButton(R$string.appcenter_distribute_update_failed_dialog_ignore, new DialogInterface.OnClickListener() { // from class: com.microsoft.appcenter.distribute.Distribute.12
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    Distribute.this.storeUpdateSetupFailedPackageHash(dialogInterface);
                }
            });
            builder.setNegativeButton(R$string.appcenter_distribute_update_failed_dialog_reinstall, new DialogInterface.OnClickListener() { // from class: com.microsoft.appcenter.distribute.Distribute.13
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    Distribute.this.handleUpdateFailedDialogReinstallAction(dialogInterface);
                }
            });
            AlertDialog create = builder.create();
            this.mUpdateSetupFailedDialog = create;
            showAndRememberDialogActivity(create);
            SharedPreferencesManager.remove("Distribute.update_setup_failed_message");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void goToUnknownAppsSettings(ReleaseDetails releaseDetails) {
        Intent intent;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                intent.setData(Uri.parse("package:" + this.mForegroundActivity.getPackageName()));
            } else {
                intent = new Intent("android.settings.SECURITY_SETTINGS");
            }
            try {
                this.mForegroundActivity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                AppCenterLog.warn("AppCenterDistribute", "No way to navigate to secure settings on this device automatically");
                if (releaseDetails == this.mReleaseDetails) {
                    completeWorkflow();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void postponeRelease(ReleaseDetails releaseDetails) {
        try {
            if (releaseDetails == this.mReleaseDetails) {
                AppCenterLog.debug("AppCenterDistribute", "Postpone updates for a day.");
                SharedPreferencesManager.putLong("Distribute.postpone_time", System.currentTimeMillis());
                completeWorkflow();
            } else {
                showDisabledToast();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void enqueueDownloadOrShowUnknownSourcesDialog(ReleaseDetails releaseDetails) {
        try {
            if (releaseDetails == this.mReleaseDetails) {
                if (InstallerUtils.isUnknownSourcesEnabled(this.mContext)) {
                    AppCenterLog.debug("AppCenterDistribute", "Schedule download...");
                    resumeDownload();
                    showDownloadProgress();
                    ServiceCall serviceCall = this.mCheckReleaseApiCall;
                    if (serviceCall != null) {
                        serviceCall.cancel();
                    }
                } else {
                    showUnknownSourcesDialog();
                }
            } else {
                showDisabledToast();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void showDisabledToast() {
        Toast.makeText(this.mContext, R$string.appcenter_distribute_dialog_actioned_on_disabled_toast, 0).show();
    }

    synchronized void resumeApp(Context context) {
        if (this.mForegroundActivity == null) {
            Intent intent = new Intent(context, (Class<?>) DeepLinkActivity.class);
            intent.addFlags(TLObject.FLAG_28);
            context.startActivity(intent);
        }
    }

    synchronized boolean notifyDownload(ReleaseDetails releaseDetails, Intent intent) {
        Notification.Builder oldNotificationBuilder;
        try {
            if (releaseDetails != this.mReleaseDetails) {
                return true;
            }
            if (this.mForegroundActivity == null && DistributeUtils.getStoredDownloadState() != 3) {
                AppCenterLog.debug("AppCenterDistribute", "Post a notification as the download finished in background.");
                NotificationManager notificationManager = (NotificationManager) this.mContext.getSystemService("notification");
                if (Build.VERSION.SDK_INT >= 26) {
                    SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                    notificationManager.createNotificationChannel(zzo$$ExternalSyntheticApiModelOutline2.m("appcenter.distribute", this.mContext.getString(R$string.appcenter_distribute_notification_category), 3));
                    Distribute$$ExternalSyntheticApiModelOutline1.m();
                    oldNotificationBuilder = Distribute$$ExternalSyntheticApiModelOutline0.m(this.mContext, "appcenter.distribute");
                } else {
                    oldNotificationBuilder = getOldNotificationBuilder();
                }
                Context context = this.mContext;
                int i = R$string.appcenter_distribute_install_ready_title;
                oldNotificationBuilder.setTicker(context.getString(i)).setContentTitle(this.mContext.getString(i)).setContentText(getInstallReadyMessage()).setSmallIcon(this.mContext.getApplicationInfo().icon).setContentIntent(PendingIntent.getActivities(this.mContext, 0, new Intent[]{intent}, 0));
                oldNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(getInstallReadyMessage()));
                Notification build = oldNotificationBuilder.build();
                build.flags |= 16;
                notificationManager.notify(DistributeUtils.getNotificationId(), build);
                SharedPreferencesManager.putInt("Distribute.download_state", 3);
                this.mCheckedDownload = false;
                return true;
            }
            return false;
        } finally {
        }
    }

    private Notification.Builder getOldNotificationBuilder() {
        return new Notification.Builder(this.mContext);
    }

    private synchronized void showDownloadProgress() {
        Activity activity = this.mForegroundActivity;
        if (activity == null) {
            AppCenterLog.warn("AppCenterDistribute", "Could not display progress dialog in the background.");
            return;
        }
        ReleaseDownloadListener releaseDownloadListener = this.mReleaseDownloaderListener;
        if (releaseDownloadListener == null) {
            return;
        }
        ProgressDialog showDownloadProgress = releaseDownloadListener.showDownloadProgress(activity);
        if (showDownloadProgress != null) {
            showAndRememberDialogActivity(showDownloadProgress);
        }
    }

    private synchronized void showMandatoryDownloadReadyDialog() {
        if (shouldRefreshDialog(this.mCompletedDownloadDialog)) {
            final ReleaseDetails releaseDetails = this.mReleaseDetails;
            AlertDialog.Builder builder = new AlertDialog.Builder(this.mForegroundActivity);
            builder.setCancelable(false);
            builder.setTitle(R$string.appcenter_distribute_install_ready_title);
            builder.setMessage(getInstallReadyMessage());
            builder.setPositiveButton(R$string.appcenter_distribute_install, new DialogInterface.OnClickListener() { // from class: com.microsoft.appcenter.distribute.Distribute.14
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    Distribute.this.installMandatoryUpdate(releaseDetails);
                }
            });
            AlertDialog create = builder.create();
            this.mCompletedDownloadDialog = create;
            showAndRememberDialogActivity(create);
        }
    }

    private String getInstallReadyMessage() {
        return formatAppNameAndVersion(this.mContext.getString(R$string.appcenter_distribute_install_ready_message));
    }

    private String formatAppNameAndVersion(String str) {
        return String.format(str, AppNameHelper.getAppName(this.mContext), this.mReleaseDetails.getShortVersion(), Integer.valueOf(this.mReleaseDetails.getVersion()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void installMandatoryUpdate(ReleaseDetails releaseDetails) {
        try {
            if (releaseDetails == this.mReleaseDetails) {
                resumeDownload();
            } else {
                showDisabledToast();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void resumeDownload() {
        ReleaseDownloader releaseDownloader = this.mReleaseDownloader;
        if (releaseDownloader != null) {
            releaseDownloader.resume();
            this.mCheckedDownload = true;
        }
    }

    synchronized void setDownloading(ReleaseDetails releaseDetails, long j) {
        if (releaseDetails != this.mReleaseDetails) {
            return;
        }
        SharedPreferencesManager.putInt("Distribute.download_state", 2);
        SharedPreferencesManager.putLong("Distribute.download_time", j);
    }

    synchronized void setInstalling(ReleaseDetails releaseDetails) {
        try {
            if (releaseDetails != this.mReleaseDetails) {
                return;
            }
            if (releaseDetails.isMandatoryUpdate()) {
                cancelNotification();
                SharedPreferencesManager.putInt("Distribute.download_state", 4);
            } else {
                completeWorkflow(releaseDetails);
            }
            String distributionGroupId = releaseDetails.getDistributionGroupId();
            String releaseHash = releaseDetails.getReleaseHash();
            int id = releaseDetails.getId();
            AppCenterLog.debug("AppCenterDistribute", "Stored release details: group id=" + distributionGroupId + " release hash=" + releaseHash + " release id=" + id);
            SharedPreferencesManager.putString("Distribute.downloaded_distribution_group_id", distributionGroupId);
            SharedPreferencesManager.putString("Distribute.downloaded_release_hash", releaseHash);
            SharedPreferencesManager.putInt("Distribute.downloaded_release_id", id);
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void enqueueDistributionStartSessionLog() {
        SessionContext.SessionInfo sessionAt = SessionContext.getInstance().getSessionAt(System.currentTimeMillis());
        if (sessionAt != null && sessionAt.getSessionId() != null) {
            post(new Runnable() { // from class: com.microsoft.appcenter.distribute.Distribute.15
                @Override // java.lang.Runnable
                public void run() {
                    ((AbstractAppCenterService) Distribute.this).mChannel.enqueue(new DistributionStartSessionLog(), "group_distribute", 1);
                }
            });
            return;
        }
        AppCenterLog.debug("AppCenterDistribute", "No sessions were logged before, ignore sending of the distribution start session log.");
    }
}
