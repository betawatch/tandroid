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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.z61;
import org.telegram.ui.IUpdateLayout;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public class ApplicationLoaderImpl extends ApplicationLoader {
    private static long lastUpdateCheckTime;

    private String getVersionName(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? i10 != 7 ? "unknown" : ru.noties.jlatexmath.android.BuildConfig.BUILD_TYPE : "standalone" : "hardcore" : "public" : "private" : "local-debug";
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public void appCenterLogInternal(Throwable th2) {
        try {
            s9.d dVar = (s9.d) k9.h.c().b(s9.d.class);
            if (dVar == null) {
                throw new NullPointerException("FirebaseCrashlytics component is not present.");
            }
            dVar.a(th2);
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
        org.telegram.ui.Components.e5.j(context, null).show();
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
    public void checkUpdate(boolean z10, Runnable runnable) {
        if (isCustomUpdate()) {
            BetaUpdaterController.getInstance().checkForUpdate(z10, runnable);
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
        boolean z10 = false;
        try {
            FileLoader.getAttachFileName(document);
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
            z10 = pathToAttach.exists();
            if (z10) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", pathToAttach), "application/vnd.android.package-archive");
                } else {
                    intent.setDataAndType(Uri.fromFile(pathToAttach), "application/vnd.android.package-archive");
                }
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        return z10;
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public boolean showCustomUpdateAppPopup(Context context, BetaUpdate betaUpdate, int i10) {
        try {
            new z61(context, betaUpdate).show();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
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
                s9.d dVar = (s9.d) k9.h.c().b(s9.d.class);
                if (dVar == null) {
                    throw new NullPointerException("FirebaseCrashlytics component is not present.");
                }
                dVar.d(str2);
                dVar.c("version", getVersionName(4));
                dVar.c("model", Build.MODEL);
                dVar.c("manufacturer", Build.MANUFACTURER);
                if (Build.VERSION.SDK_INT >= 31) {
                    str = Build.SOC_MODEL;
                    dVar.c("soc_model", str);
                    dVar.c("soc_manufacturer", Build.SOC_MANUFACTURER);
                }
                dVar.c("device", Build.DEVICE);
                dVar.c("product", Build.PRODUCT);
                dVar.c("hardware", Build.HARDWARE);
                dVar.c("user", Build.USER);
                dVar.b();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public IUpdateLayout takeUpdateLayout(Activity activity, ViewGroup viewGroup) {
        if (isCustomUpdate()) {
            return new a71(activity, viewGroup);
        }
        return null;
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public void logDualCameraInternal(boolean z10, boolean z11) {
    }
}
