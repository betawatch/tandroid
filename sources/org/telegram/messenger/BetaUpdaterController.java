package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.web.HttpGetTask;

/* loaded from: classes.dex */
public class BetaUpdaterController {
    private static final long CHECK_INTERVAL = 1200000;
    private static final long CHECK_INTERVAL_PAUSED = 86400000;
    private static final long CHECK_INTERVAL_PRIVATE = 240000;
    private static BetaUpdaterController instance;
    private String changelog;
    private boolean checkingForUpdate;
    private boolean downloading;
    private float downloadingProgress;
    private HttpGetFileTask downloadingTask;
    private String fileUrl;
    private long lastCheck;
    private String path;
    private String version;
    private int versionCode;
    private boolean firstCheck = true;
    private final Runnable scheduledUpdateCheck = new Runnable() { // from class: org.telegram.messenger.BetaUpdaterController$$ExternalSyntheticLambda4
        @Override // java.lang.Runnable
        public final void run() {
            BetaUpdaterController.this.lambda$new$0();
        }
    };

    public BetaUpdaterController() {
        load();
    }

    private void downloadUpdate(boolean z) {
        if (this.downloading || !TextUtils.isEmpty(this.path)) {
            return;
        }
        this.downloading = true;
        this.downloadingProgress = 0.0f;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateLoading, new Object[0]);
        if (!TextUtils.isEmpty(this.fileUrl)) {
            HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new Utilities.Callback() { // from class: org.telegram.messenger.BetaUpdaterController$$ExternalSyntheticLambda2
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    BetaUpdaterController.this.lambda$downloadUpdate$5((File) obj);
                }
            }, new Utilities.Callback() { // from class: org.telegram.messenger.BetaUpdaterController$$ExternalSyntheticLambda3
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    BetaUpdaterController.this.lambda$downloadUpdate$6((Float) obj);
                }
            });
            this.downloadingTask = httpGetFileTask;
            httpGetFileTask.execute(this.fileUrl);
        } else if (z) {
            this.downloading = false;
        } else {
            checkForUpdate(true, new Runnable() { // from class: org.telegram.messenger.BetaUpdaterController$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    BetaUpdaterController.this.lambda$downloadUpdate$3();
                }
            });
        }
    }

    private String getCurrentVersion() {
        try {
            return ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionName;
        } catch (Exception e) {
            FileLog.e(e);
            return "";
        }
    }

    private int getCurrentVersionCode() {
        try {
            return ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            FileLog.e(e);
            return 0;
        }
    }

    public static BetaUpdaterController getInstance() {
        if (instance == null) {
            instance = new BetaUpdaterController();
        }
        return instance;
    }

    private SharedPreferences getSharedPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("beta", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1 A[Catch: Exception -> 0x0032, TryCatch #2 {Exception -> 0x0032, blocks: (B:3:0x0003, B:5:0x0027, B:7:0x002d, B:10:0x0067, B:12:0x006b, B:14:0x006f, B:16:0x0075, B:18:0x0079, B:19:0x0064, B:20:0x00b4, B:22:0x00c1, B:23:0x00cc, B:26:0x00de, B:28:0x00e3, B:31:0x00e7, B:33:0x00eb, B:35:0x00ef, B:38:0x00f6, B:41:0x00fe, B:45:0x00f4, B:49:0x007c, B:51:0x0084, B:56:0x0090, B:57:0x0093, B:59:0x009f, B:61:0x00a5, B:62:0x00ac, B:63:0x0035, B:65:0x003f, B:67:0x0045, B:69:0x004d, B:74:0x0059, B:75:0x005c, B:53:0x008b, B:71:0x0054), top: B:2:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: Exception -> 0x0032, TryCatch #2 {Exception -> 0x0032, blocks: (B:3:0x0003, B:5:0x0027, B:7:0x002d, B:10:0x0067, B:12:0x006b, B:14:0x006f, B:16:0x0075, B:18:0x0079, B:19:0x0064, B:20:0x00b4, B:22:0x00c1, B:23:0x00cc, B:26:0x00de, B:28:0x00e3, B:31:0x00e7, B:33:0x00eb, B:35:0x00ef, B:38:0x00f6, B:41:0x00fe, B:45:0x00f4, B:49:0x007c, B:51:0x0084, B:56:0x0090, B:57:0x0093, B:59:0x009f, B:61:0x00a5, B:62:0x00ac, B:63:0x0035, B:65:0x003f, B:67:0x0045, B:69:0x004d, B:74:0x0059, B:75:0x005c, B:53:0x008b, B:71:0x0054), top: B:2:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7 A[Catch: Exception -> 0x0032, TryCatch #2 {Exception -> 0x0032, blocks: (B:3:0x0003, B:5:0x0027, B:7:0x002d, B:10:0x0067, B:12:0x006b, B:14:0x006f, B:16:0x0075, B:18:0x0079, B:19:0x0064, B:20:0x00b4, B:22:0x00c1, B:23:0x00cc, B:26:0x00de, B:28:0x00e3, B:31:0x00e7, B:33:0x00eb, B:35:0x00ef, B:38:0x00f6, B:41:0x00fe, B:45:0x00f4, B:49:0x007c, B:51:0x0084, B:56:0x0090, B:57:0x0093, B:59:0x009f, B:61:0x00a5, B:62:0x00ac, B:63:0x0035, B:65:0x003f, B:67:0x0045, B:69:0x004d, B:74:0x0059, B:75:0x005c, B:53:0x008b, B:71:0x0054), top: B:2:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084 A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #2 {Exception -> 0x0032, blocks: (B:3:0x0003, B:5:0x0027, B:7:0x002d, B:10:0x0067, B:12:0x006b, B:14:0x006f, B:16:0x0075, B:18:0x0079, B:19:0x0064, B:20:0x00b4, B:22:0x00c1, B:23:0x00cc, B:26:0x00de, B:28:0x00e3, B:31:0x00e7, B:33:0x00eb, B:35:0x00ef, B:38:0x00f6, B:41:0x00fe, B:45:0x00f4, B:49:0x007c, B:51:0x0084, B:56:0x0090, B:57:0x0093, B:59:0x009f, B:61:0x00a5, B:62:0x00ac, B:63:0x0035, B:65:0x003f, B:67:0x0045, B:69:0x004d, B:74:0x0059, B:75:0x005c, B:53:0x008b, B:71:0x0054), top: B:2:0x0003, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$checkForUpdate$1(String str, Runnable runnable) {
        String str2;
        this.checkingForUpdate = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            int i = jSONObject.getInt("version_code");
            String string2 = jSONObject.getString("file_url");
            String optString = jSONObject.optString("changelog", null);
            int i2 = this.versionCode;
            String str3 = this.version;
            if (str3 != null) {
                if (SharedConfig.versionBiggerOrEqual(string, str3) && i > this.versionCode) {
                }
                str2 = this.version;
                if (str2 == null && this.versionCode != 0 && SharedConfig.versionBiggerOrEqual(str2, string) && this.versionCode == i) {
                    this.fileUrl = string2;
                } else {
                    if (!TextUtils.isEmpty(this.path)) {
                        try {
                            new File(this.path).delete();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    this.path = null;
                    if (SharedConfig.versionBiggerOrEqual(getCurrentVersion(), string) || getCurrentVersionCode() >= i) {
                        this.version = null;
                        this.versionCode = 0;
                        this.fileUrl = null;
                        this.changelog = null;
                        this.lastCheck = System.currentTimeMillis();
                        save();
                        if (this.versionCode != i2) {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                        }
                        AndroidUtilities.cancelRunOnUIThread(this.scheduledUpdateCheck);
                        AndroidUtilities.runOnUIThread(this.scheduledUpdateCheck, !BuildVars.DEBUG_PRIVATE_VERSION ? CHECK_INTERVAL_PRIVATE : CHECK_INTERVAL);
                        if (runnable == null) {
                            runnable.run();
                            return;
                        }
                        if (this.versionCode == i2 || ApplicationLoader.mainInterfacePaused) {
                            return;
                        }
                        Context context = LaunchActivity.instance;
                        if (context == null) {
                            context = ApplicationLoader.applicationContext;
                        }
                        BetaUpdate update = getUpdate();
                        if (context == null || update == null) {
                            return;
                        }
                        ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(context, update, UserConfig.selectedAccount);
                        return;
                    }
                    this.version = string;
                    this.versionCode = i;
                    this.fileUrl = string2;
                }
                this.changelog = optString;
                this.lastCheck = System.currentTimeMillis();
                save();
                if (this.versionCode != i2) {
                }
                AndroidUtilities.cancelRunOnUIThread(this.scheduledUpdateCheck);
                AndroidUtilities.runOnUIThread(this.scheduledUpdateCheck, !BuildVars.DEBUG_PRIVATE_VERSION ? CHECK_INTERVAL_PRIVATE : CHECK_INTERVAL);
                if (runnable == null) {
                }
            }
            if (SharedConfig.versionBiggerOrEqual(string, getCurrentVersion()) && i > getCurrentVersionCode()) {
                if (!TextUtils.isEmpty(this.path)) {
                    try {
                        new File(this.path).delete();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }
                this.path = null;
                this.version = string;
                this.versionCode = i;
                this.fileUrl = string2;
                this.changelog = optString;
                this.lastCheck = System.currentTimeMillis();
                save();
                if (this.versionCode != i2) {
                }
                AndroidUtilities.cancelRunOnUIThread(this.scheduledUpdateCheck);
                AndroidUtilities.runOnUIThread(this.scheduledUpdateCheck, !BuildVars.DEBUG_PRIVATE_VERSION ? CHECK_INTERVAL_PRIVATE : CHECK_INTERVAL);
                if (runnable == null) {
                }
            }
            str2 = this.version;
            if (str2 == null) {
            }
            if (!TextUtils.isEmpty(this.path)) {
            }
            this.path = null;
            if (SharedConfig.versionBiggerOrEqual(getCurrentVersion(), string)) {
            }
            this.version = null;
            this.versionCode = 0;
            this.fileUrl = null;
            this.changelog = null;
            this.lastCheck = System.currentTimeMillis();
            save();
            if (this.versionCode != i2) {
            }
            AndroidUtilities.cancelRunOnUIThread(this.scheduledUpdateCheck);
            AndroidUtilities.runOnUIThread(this.scheduledUpdateCheck, !BuildVars.DEBUG_PRIVATE_VERSION ? CHECK_INTERVAL_PRIVATE : CHECK_INTERVAL);
            if (runnable == null) {
            }
        } catch (Exception e3) {
            FileLog.e("Failed to check for beta update at https://telegram.org/dl/android/apk-public-beta.json received: " + str, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkForUpdate$2(final Runnable runnable, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.BetaUpdaterController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BetaUpdaterController.this.lambda$checkForUpdate$1(str, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadUpdate$3() {
        downloadUpdate(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadUpdate$4(File file) {
        if (file == null) {
            this.downloading = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            return;
        }
        if (!TextUtils.isEmpty(this.path)) {
            try {
                new File(this.path).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.path = file.getAbsolutePath();
        save();
        this.downloadingProgress = 1.0f;
        this.downloading = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadUpdate$5(final File file) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.BetaUpdaterController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                BetaUpdaterController.this.lambda$downloadUpdate$4(file);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadUpdate$6(Float f) {
        this.downloadingProgress = f.floatValue();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateLoading, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        checkForUpdate(false, null);
    }

    private void load() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        this.version = sharedPreferences.getString("version", null);
        this.versionCode = sharedPreferences.getInt("versionCode", 0);
        this.changelog = sharedPreferences.getString("changelog", null);
        this.path = sharedPreferences.getString("path", null);
        this.lastCheck = sharedPreferences.getLong("lastCheck", 0L);
        if (getCurrentVersionCode() >= this.versionCode || !(TextUtils.isEmpty(this.path) || new File(this.path).exists())) {
            this.version = null;
            this.versionCode = 0;
            this.path = null;
            this.changelog = null;
            this.lastCheck = 0L;
            save();
        }
    }

    private void save() {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        if (TextUtils.isEmpty(this.version)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.version);
        }
        if (TextUtils.isEmpty(this.changelog)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.changelog);
        }
        int i = this.versionCode;
        if (i == 0) {
            edit.remove("versionCode");
        } else {
            edit.putInt("versionCode", i);
        }
        if (TextUtils.isEmpty(this.path)) {
            edit.remove("path");
        } else {
            edit.putString("path", this.path);
        }
        long j = this.lastCheck;
        if (j == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j);
        }
        edit.apply();
    }

    public void cancelDownloadingUpdate() {
        if (this.downloading) {
            HttpGetFileTask httpGetFileTask = this.downloadingTask;
            if (httpGetFileTask != null) {
                httpGetFileTask.cancel(false);
            }
            this.downloading = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        }
    }

    public void checkForUpdate(boolean z, final Runnable runnable) {
        if (this.checkingForUpdate) {
            return;
        }
        if (this.firstCheck) {
            z = true;
        }
        if (!z) {
            if (System.currentTimeMillis() - this.lastCheck < (ApplicationLoader.mainInterfacePaused ? CHECK_INTERVAL_PAUSED : BuildVars.DEBUG_PRIVATE_VERSION ? CHECK_INTERVAL_PRIVATE : CHECK_INTERVAL)) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        this.checkingForUpdate = true;
        this.firstCheck = false;
        new HttpGetTask(new Utilities.Callback() { // from class: org.telegram.messenger.BetaUpdaterController$$ExternalSyntheticLambda6
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                BetaUpdaterController.this.lambda$checkForUpdate$2(runnable, (String) obj);
            }
        }).execute(BuildConfig.BETA_URL);
    }

    public void downloadUpdate() {
        downloadUpdate(false);
    }

    public File getDownloadedFile() {
        if (this.path == null) {
            return null;
        }
        File file = new File(this.path);
        if (file.exists()) {
            return file;
        }
        this.path = null;
        save();
        return null;
    }

    public float getDownloadingProgress() {
        return this.downloadingProgress;
    }

    public BetaUpdate getUpdate() {
        int i;
        String str = this.version;
        if (str == null || (i = this.versionCode) == 0) {
            return null;
        }
        return new BetaUpdate(str, i, this.changelog);
    }

    public boolean isDownloading() {
        return this.downloading;
    }
}
