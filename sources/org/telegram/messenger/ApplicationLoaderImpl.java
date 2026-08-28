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
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.IUpdateLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class ApplicationLoaderImpl extends ApplicationLoader {
    private static long lastUpdateCheckTime;

    private String getVersionName(int i9) {
        return i9 != 0 ? i9 != 1 ? i9 != 4 ? i9 != 5 ? i9 != 6 ? i9 != 7 ? "unknown" : ru.noties.jlatexmath.android.BuildConfig.BUILD_TYPE : "standalone" : "hardcore" : "public" : "private" : "local-debug";
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public void appCenterLogInternal(Throwable th) {
        try {
            a9.e eVar = (a9.e) s8.h.c().b(a9.e.class);
            if (eVar == null) {
                throw new NullPointerException("FirebaseCrashlytics component is not present.");
            }
            eVar.a(th);
        } catch (Throwable th2) {
            FileLog.e(th2, false);
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
        org.telegram.ui.Components.y4.j(context, null).show();
        return false;
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public void checkForUpdatesInternal() {
        try {
            if (BuildVars.DEBUG_VERSION && SystemClock.elapsedRealtime() - lastUpdateCheckTime >= 3600000) {
                lastUpdateCheckTime = SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            FileLog.e(th);
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        return z10;
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public boolean showCustomUpdateAppPopup(Context context, BetaUpdate betaUpdate, int i9) {
        try {
            new o51(context, betaUpdate).show();
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
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
                a9.e eVar = (a9.e) s8.h.c().b(a9.e.class);
                if (eVar == null) {
                    throw new NullPointerException("FirebaseCrashlytics component is not present.");
                }
                eVar.d(str2);
                eVar.c("version", getVersionName(4));
                eVar.c("model", Build.MODEL);
                eVar.c("manufacturer", Build.MANUFACTURER);
                if (Build.VERSION.SDK_INT >= 31) {
                    str = Build.SOC_MODEL;
                    eVar.c("soc_model", str);
                    eVar.c("soc_manufacturer", Build.SOC_MANUFACTURER);
                }
                eVar.c("device", Build.DEVICE);
                eVar.c("product", Build.PRODUCT);
                eVar.c("hardware", Build.HARDWARE);
                eVar.c("user", Build.USER);
                eVar.b();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public IUpdateLayout takeUpdateLayout(Activity activity, ViewGroup viewGroup) {
        if (isCustomUpdate()) {
            return new p51(activity, viewGroup);
        }
        return null;
    }

    @Override // org.telegram.messenger.ApplicationLoader
    public void logDualCameraInternal(boolean z10, boolean z11) {
    }
}
