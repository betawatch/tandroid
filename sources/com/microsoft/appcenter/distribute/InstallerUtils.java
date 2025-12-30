package com.microsoft.appcenter.distribute;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.microsoft.appcenter.utils.AppCenterLog;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* loaded from: classes3.dex */
public abstract class InstallerUtils {
    private static final Set LOCAL_STORES;
    private static Boolean sInstalledFromAppStore;

    static {
        HashSet hashSet = new HashSet();
        LOCAL_STORES = hashSet;
        hashSet.add("adb");
        hashSet.add("com.android.packageinstaller");
        hashSet.add("com.google.android.packageinstaller");
        hashSet.add("com.android.managedprovisioning");
        hashSet.add("com.miui.packageinstaller");
        hashSet.add("com.samsung.android.packageinstaller");
        hashSet.add("pc");
        hashSet.add("com.google.android.apps.nbu.files");
        hashSet.add("org.mozilla.firefox");
        hashSet.add("com.android.chrome");
    }

    static Intent getInstallIntent(Uri uri) {
        Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
        intent.setData(uri);
        intent.addFlags(1);
        intent.addFlags(TLObject.FLAG_28);
        intent.addFlags(TLObject.FLAG_29);
        return intent;
    }

    static synchronized boolean isInstalledFromAppStore(String str, Context context) {
        boolean booleanValue;
        synchronized (InstallerUtils.class) {
            try {
                if (sInstalledFromAppStore == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    AppCenterLog.debug(str, "InstallerPackageName=" + installerPackageName);
                    sInstalledFromAppStore = Boolean.valueOf((installerPackageName == null || LOCAL_STORES.contains(installerPackageName)) ? false : true);
                }
                booleanValue = sInstalledFromAppStore.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean isUnknownSourcesEnabled(Context context) {
        boolean canRequestPackageInstalls;
        if (Build.VERSION.SDK_INT >= 26) {
            if (context.getApplicationInfo().targetSdkVersion >= 26) {
                canRequestPackageInstalls = context.getPackageManager().canRequestPackageInstalls();
                if (!canRequestPackageInstalls) {
                    return false;
                }
            }
            return true;
        }
        return "1".equals(Settings.Secure.getString(context.getContentResolver(), "install_non_market_apps"));
    }
}
