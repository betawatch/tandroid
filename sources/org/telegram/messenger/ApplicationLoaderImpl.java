package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.content.FileProvider;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.o61;
import org.telegram.ui.IUpdateLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class ApplicationLoaderImpl extends ApplicationLoader {
    private static long lastUpdateCheckTime;

    private String getVersionName(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? i10 != 7 ? "unknown" : ru.noties.jlatexmath.android.BuildConfig.BUILD_TYPE : "standalone" : "hardcore" : "public" : "private" : "local-debug";
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public void appCenterLogInternal(Throwable th2) {
        try {
            e9.c cVar = (e9.c) w8.g.c().b(e9.c.class);
            if (cVar == null) {
                throw new NullPointerException("FirebaseCrashlytics component is not present.");
            }
            cVar.a(th2);
        } catch (Throwable th3) {
            FileLog.e(th3, false);
        }
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public void cancelDownloadingUpdate() {
        if (isCustomUpdate()) {
            BetaUpdaterController.getInstance().cancelDownloadingUpdate();
        }
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public boolean checkApkInstallPermissions(Context context) {
        if (Build.VERSION.SDK_INT < 26 || ApplicationLoader.applicationContext.getPackageManager().canRequestPackageInstalls()) {
            return true;
        }
        org.telegram.ui.Components.z4.j(context, null).show();
        return false;
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public void checkForUpdatesInternal() {
        try {
            if (BuildVars.DEBUG_VERSION && SystemClock.elapsedRealtime() - lastUpdateCheckTime >= 3600000) {
                lastUpdateCheckTime = SystemClock.elapsedRealtime();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public void checkUpdate(boolean z4, Runnable runnable) {
        if (isCustomUpdate()) {
            BetaUpdaterController.getInstance().checkForUpdate(z4, runnable);
        }
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public void downloadUpdate() {
        if (isCustomUpdate()) {
            BetaUpdaterController.getInstance().downloadUpdate();
        }
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public File getDownloadedUpdateFile() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().getDownloadedFile();
        }
        return null;
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public float getDownloadingUpdateProgress() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().getDownloadingProgress();
        }
        return 0.0f;
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public BetaUpdate getUpdate() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().getUpdate();
        }
        return null;
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public boolean isBeta() {
        return true;
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public boolean isCustomUpdate() {
        return !TextUtils.isEmpty(BuildConfig.BETA_URL);
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public boolean isDownloadingUpdate() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().isDownloading();
        }
        return false;
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public String onGetApplicationId() {
        return "org.telegram.messenger.beta";
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public boolean openApkInstall(Activity activity, TLRPC.Document document) {
        boolean z4 = false;
        try {
            FileLoader.getAttachFileName(document);
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
            z4 = pathToAttach.exists();
            if (z4) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", pathToAttach), "application/vnd.android.package-archive");
                } else {
                    intent.setDataAndType(Uri.fromFile(pathToAttach), "application/vnd.android.package-archive");
                }
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return z4;
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public boolean showCustomUpdateAppPopup(Context context, BetaUpdate betaUpdate, int i10) {
        try {
            new n61(context, betaUpdate).show();
            return true;
        } catch (Exception e6) {
            FileLog.e(e6);
            return true;
        }
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public void startAppCenterInternal(Activity activity) {
        String str;
        try {
            if (BuildVars.DEBUG_VERSION) {
                String str2 = "" + UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() != null) {
                    String publicUsername = UserObject.getPublicUsername(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                    if (!TextUtils.isEmpty(publicUsername)) {
                        str2 = "@" + publicUsername;
                    }
                }
                if (ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend()) {
                    str2 = str2 + " [TEST SERVER]";
                }
                e9.c cVar = (e9.c) w8.g.c().b(e9.c.class);
                if (cVar == null) {
                    throw new NullPointerException("FirebaseCrashlytics component is not present.");
                }
                cVar.d(str2);
                cVar.c("version", getVersionName(4));
                cVar.c("model", Build.MODEL);
                cVar.c("manufacturer", Build.MANUFACTURER);
                if (Build.VERSION.SDK_INT >= 31) {
                    str = Build.SOC_MODEL;
                    cVar.c("soc_model", str);
                    cVar.c("soc_manufacturer", Build.SOC_MANUFACTURER);
                }
                cVar.c("device", Build.DEVICE);
                cVar.c("product", Build.PRODUCT);
                cVar.c("hardware", Build.HARDWARE);
                cVar.c("user", Build.USER);
                cVar.b();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public IUpdateLayout takeUpdateLayout(Activity activity, ViewGroup viewGroup) {
        if (isCustomUpdate()) {
            return new o61(activity, viewGroup);
        }
        return null;
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public void logDualCameraInternal(boolean z4, boolean z10) {
    }
}
