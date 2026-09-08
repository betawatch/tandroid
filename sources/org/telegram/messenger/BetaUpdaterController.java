package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
    private final Runnable scheduledUpdateCheck = new t(this, 1);

    public BetaUpdaterController() {
        load();
    }

    private String getCurrentVersion() {
        try {
            return ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionName;
        } catch (Exception e7) {
            FileLog.e(e7);
            return "";
        }
    }

    private int getCurrentVersionCode() {
        try {
            return ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode;
        } catch (Exception e7) {
            FileLog.e(e7);
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
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:3:0x0003, B:5:0x0029, B:7:0x002f, B:10:0x0069, B:12:0x006d, B:14:0x0071, B:16:0x0077, B:18:0x007b, B:19:0x00ba, B:21:0x00c7, B:22:0x00d2, B:25:0x00e4, B:27:0x00e9, B:30:0x00ed, B:32:0x00f1, B:34:0x00f5, B:37:0x00fc, B:40:0x0104, B:44:0x00fa, B:48:0x0080, B:50:0x0088, B:55:0x0094, B:56:0x0097, B:58:0x00a3, B:60:0x00a9, B:61:0x00b2, B:62:0x0037, B:64:0x0041, B:66:0x0047, B:68:0x004f, B:73:0x005b, B:74:0x005e, B:70:0x0056, B:52:0x008f), top: B:2:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:3:0x0003, B:5:0x0029, B:7:0x002f, B:10:0x0069, B:12:0x006d, B:14:0x0071, B:16:0x0077, B:18:0x007b, B:19:0x00ba, B:21:0x00c7, B:22:0x00d2, B:25:0x00e4, B:27:0x00e9, B:30:0x00ed, B:32:0x00f1, B:34:0x00f5, B:37:0x00fc, B:40:0x0104, B:44:0x00fa, B:48:0x0080, B:50:0x0088, B:55:0x0094, B:56:0x0097, B:58:0x00a3, B:60:0x00a9, B:61:0x00b2, B:62:0x0037, B:64:0x0041, B:66:0x0047, B:68:0x004f, B:73:0x005b, B:74:0x005e, B:70:0x0056, B:52:0x008f), top: B:2:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:3:0x0003, B:5:0x0029, B:7:0x002f, B:10:0x0069, B:12:0x006d, B:14:0x0071, B:16:0x0077, B:18:0x007b, B:19:0x00ba, B:21:0x00c7, B:22:0x00d2, B:25:0x00e4, B:27:0x00e9, B:30:0x00ed, B:32:0x00f1, B:34:0x00f5, B:37:0x00fc, B:40:0x0104, B:44:0x00fa, B:48:0x0080, B:50:0x0088, B:55:0x0094, B:56:0x0097, B:58:0x00a3, B:60:0x00a9, B:61:0x00b2, B:62:0x0037, B:64:0x0041, B:66:0x0047, B:68:0x004f, B:73:0x005b, B:74:0x005e, B:70:0x0056, B:52:0x008f), top: B:2:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088 A[Catch: Exception -> 0x0034, TRY_LEAVE, TryCatch #1 {Exception -> 0x0034, blocks: (B:3:0x0003, B:5:0x0029, B:7:0x002f, B:10:0x0069, B:12:0x006d, B:14:0x0071, B:16:0x0077, B:18:0x007b, B:19:0x00ba, B:21:0x00c7, B:22:0x00d2, B:25:0x00e4, B:27:0x00e9, B:30:0x00ed, B:32:0x00f1, B:34:0x00f5, B:37:0x00fc, B:40:0x0104, B:44:0x00fa, B:48:0x0080, B:50:0x0088, B:55:0x0094, B:56:0x0097, B:58:0x00a3, B:60:0x00a9, B:61:0x00b2, B:62:0x0037, B:64:0x0041, B:66:0x0047, B:68:0x004f, B:73:0x005b, B:74:0x005e, B:70:0x0056, B:52:0x008f), top: B:2:0x0003, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$checkForUpdate$1(String str, Runnable runnable) {
        String str2;
        this.checkingForUpdate = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            int i10 = jSONObject.getInt("version_code");
            String string2 = jSONObject.getString("file_url");
            String optString = jSONObject.optString("changelog", null);
            int i11 = this.versionCode;
            String str3 = this.version;
            if (str3 != null) {
                if (SharedConfig.versionBiggerOrEqual(string, str3) && i10 > this.versionCode) {
                }
                str2 = this.version;
                if (str2 == null && this.versionCode != 0 && SharedConfig.versionBiggerOrEqual(str2, string) && this.versionCode == i10) {
                    this.fileUrl = string2;
                    this.changelog = optString;
                } else {
                    if (!TextUtils.isEmpty(this.path)) {
                        try {
                            new File(this.path).delete();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    this.path = null;
                    if (SharedConfig.versionBiggerOrEqual(getCurrentVersion(), string) || getCurrentVersionCode() >= i10) {
                        this.version = null;
                        this.versionCode = 0;
                        this.fileUrl = null;
                        this.changelog = null;
                    } else {
                        this.version = string;
                        this.versionCode = i10;
                        this.fileUrl = string2;
                        this.changelog = optString;
                    }
                }
                this.lastCheck = System.currentTimeMillis();
                save();
                if (this.versionCode != i11) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                }
                AndroidUtilities.cancelRunOnUIThread(this.scheduledUpdateCheck);
                AndroidUtilities.runOnUIThread(this.scheduledUpdateCheck, BuildVars.DEBUG_PRIVATE_VERSION ? CHECK_INTERVAL_PRIVATE : CHECK_INTERVAL);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                if (this.versionCode == i11 || ApplicationLoader.mainInterfacePaused) {
                    return;
                }
                Context context = LaunchActivity.G1;
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
            if (SharedConfig.versionBiggerOrEqual(string, getCurrentVersion()) && i10 > getCurrentVersionCode()) {
                if (!TextUtils.isEmpty(this.path)) {
                    try {
                        new File(this.path).delete();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                this.path = null;
                this.version = string;
                this.versionCode = i10;
                this.fileUrl = string2;
                this.changelog = optString;
                this.lastCheck = System.currentTimeMillis();
                save();
                if (this.versionCode != i11) {
                }
                AndroidUtilities.cancelRunOnUIThread(this.scheduledUpdateCheck);
                AndroidUtilities.runOnUIThread(this.scheduledUpdateCheck, BuildVars.DEBUG_PRIVATE_VERSION ? CHECK_INTERVAL_PRIVATE : CHECK_INTERVAL);
                if (runnable != null) {
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
            if (this.versionCode != i11) {
            }
            AndroidUtilities.cancelRunOnUIThread(this.scheduledUpdateCheck);
            AndroidUtilities.runOnUIThread(this.scheduledUpdateCheck, BuildVars.DEBUG_PRIVATE_VERSION ? CHECK_INTERVAL_PRIVATE : CHECK_INTERVAL);
            if (runnable != null) {
            }
        } catch (Exception e11) {
            FileLog.e("Failed to check for beta update at null received: " + str, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkForUpdate$2(Runnable runnable, String str) {
        AndroidUtilities.runOnUIThread(new f0(this, str, runnable, 7));
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        this.path = file.getAbsolutePath();
        save();
        this.downloadingProgress = 1.0f;
        this.downloading = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadUpdate$5(File file) {
        AndroidUtilities.runOnUIThread(new d3(11, this, file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadUpdate$6(Float f7) {
        this.downloadingProgress = f7.floatValue();
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
        int i10 = this.versionCode;
        if (i10 == 0) {
            edit.remove("versionCode");
        } else {
            edit.putInt("versionCode", i10);
        }
        if (TextUtils.isEmpty(this.path)) {
            edit.remove("path");
        } else {
            edit.putString("path", this.path);
        }
        long j3 = this.lastCheck;
        if (j3 == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j3);
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

    public void checkForUpdate(boolean z10, Runnable runnable) {
        if (this.checkingForUpdate) {
            return;
        }
        if (this.firstCheck) {
            z10 = true;
        }
        if (!z10) {
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
        new org.telegram.ui.web.k1(new v(0, this, runnable)).execute(BuildConfig.BETA_URL);
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
        int i10;
        String str = this.version;
        if (str == null || (i10 = this.versionCode) == 0) {
            return null;
        }
        return new BetaUpdate(str, i10, this.changelog);
    }

    public boolean isDownloading() {
        return this.downloading;
    }

    private void downloadUpdate(boolean z10) {
        if (this.downloading || !TextUtils.isEmpty(this.path)) {
            return;
        }
        this.downloading = true;
        this.downloadingProgress = 0.0f;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateLoading, new Object[0]);
        if (TextUtils.isEmpty(this.fileUrl)) {
            if (z10) {
                this.downloading = false;
                return;
            } else {
                checkForUpdate(true, new t(this, 0));
                return;
            }
        }
        final int i10 = 0;
        final int i11 = 1;
        HttpGetFileTask overrideExtension = new HttpGetFileTask(new Utilities.Callback(this) { // from class: org.telegram.messenger.u
            public final /* synthetic */ BetaUpdaterController b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        this.b.lambda$downloadUpdate$5((File) obj);
                        break;
                    default:
                        this.b.lambda$downloadUpdate$6((Float) obj);
                        break;
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.messenger.u
            public final /* synthetic */ BetaUpdaterController b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        this.b.lambda$downloadUpdate$5((File) obj);
                        break;
                    default:
                        this.b.lambda$downloadUpdate$6((Float) obj);
                        break;
                }
            }
        }).setOverrideExtension("apk");
        this.downloadingTask = overrideExtension;
        overrideExtension.execute(this.fileUrl);
    }
}
