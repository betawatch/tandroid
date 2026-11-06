package n6;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                    PackageInfo c10 = z6.b.a(context).c(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    h.a(context);
                    if (c10 == null || h.b(c10, false) || !h.b(c10, true)) {
                        b = false;
                    } else {
                        b = true;
                    }
                    c = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    c = true;
                }
            }
            return b || !"user".equals(Build.TYPE);
        } catch (Throwable th2) {
            c = true;
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(Context context, int i7) {
        boolean z9;
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
            synchronized (q6.m.a) {
                try {
                    if (!q6.m.b) {
                        q6.m.b = true;
                        try {
                            bundle = z6.b.a(context).a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e10);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            q6.m.c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i10 = q6.m.c;
            if (i10 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i10 != 12451000) {
                int i11 = e.a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + qs.p1 + String.valueOf(i10).length() + qs.Y2);
                sb2.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb2.append(i11);
                sb2.append(" but found ");
                sb2.append(i10);
                sb2.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb2.toString());
            }
        }
        try {
            if (!x6.b.f(context)) {
                if (x6.b.d == null) {
                    x6.b.d = Boolean.valueOf(x6.b.d() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
                }
                if (!x6.b.d.booleanValue()) {
                    z9 = true;
                    q6.m.b(i7 < 0);
                    packageName = context.getPackageName();
                    PackageManager packageManager = context.getPackageManager();
                    if (z9) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                        }
                    }
                    packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
                    h.a(context);
                    if (h.b(packageInfo2, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                    } else {
                        if (z9) {
                            q6.m.g(packageInfo);
                            if (!h.b(packageInfo, true)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (!z9 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i12 = packageInfo2.versionCode;
                            if ((i12 == -1 ? -1 : i12 / 1000) >= (i7 != -1 ? i7 / 1000 : -1)) {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException e11) {
                                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e11);
                                        return 1;
                                    }
                                }
                                return !applicationInfo.enabled ? 3 : 0;
                            }
                            StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i7).length() + 11 + String.valueOf(i12).length());
                            sb3.append("Google Play services out of date for ");
                            sb3.append(packageName);
                            sb3.append(".  Requires ");
                            sb3.append(i7);
                            sb3.append(" but found ");
                            sb3.append(i12);
                            Log.w("GooglePlayServicesUtil", sb3.toString());
                            return 2;
                        }
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                    return 9;
                }
            }
            packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
            h.a(context);
            if (h.b(packageInfo2, true)) {
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
        z9 = false;
        q6.m.b(i7 < 0);
        packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        if (z9) {
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
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", TLObject.FLAG_13).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
