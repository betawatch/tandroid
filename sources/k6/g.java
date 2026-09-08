package k6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class g {
    public static boolean b = false;
    public static boolean c = false;
    public static final /* synthetic */ int e = 0;
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!c) {
                try {
                    PackageInfo d10 = w6.b.a(context).d(64, "com.google.android.gms");
                    h.c(context);
                    if (d10 == null || h.g(d10, false) || !h.g(d10, true)) {
                        b = false;
                    } else {
                        b = true;
                    }
                    c = true;
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e7);
                    c = true;
                }
            }
            return b || !"user".equals(Build.TYPE);
        } catch (Throwable th2) {
            c = true;
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(Context context, int i10) {
        boolean z10;
        String packageName;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        Bundle bundle;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !d.get()) {
            synchronized (n6.l.a) {
                try {
                    if (!n6.l.b) {
                        n6.l.b = true;
                        try {
                            bundle = w6.b.a(context).a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException e7) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e7);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            n6.l.c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i11 = n6.l.c;
            if (i11 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i11 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + e.a + " but found " + i11 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        try {
            if (!u6.b.f(context)) {
                if (u6.b.d == null) {
                    u6.b.d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
                }
                if (!u6.b.d.booleanValue()) {
                    z10 = true;
                    n6.l.b(i10 < 0);
                    packageName = context.getPackageName();
                    PackageManager packageManager = context.getPackageManager();
                    if (z10) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                        }
                    }
                    packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                    h.c(context);
                    if (h.g(packageInfo2, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                    } else {
                        if (z10) {
                            n6.l.h(packageInfo);
                            if (!h.g(packageInfo, true)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (!z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i12 = packageInfo2.versionCode;
                            if ((i12 == -1 ? -1 : i12 / MediaDataController.MAX_STYLE_RUNS_COUNT) >= (i10 != -1 ? i10 / MediaDataController.MAX_STYLE_RUNS_COUNT : -1)) {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException e10) {
                                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                                        return 1;
                                    }
                                }
                                return !applicationInfo.enabled ? 3 : 0;
                            }
                            Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + i12);
                            return 2;
                        }
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                    return 9;
                }
            }
            packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            h.c(context);
            if (h.g(packageInfo2, true)) {
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
        z10 = false;
        n6.l.b(i10 < 0);
        packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        if (z10) {
        }
    }

    public static boolean c(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
