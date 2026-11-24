// default package

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kd1 implements e1c {
    public final gi3 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final ti2 e;
    public final ti2 f;

    public kd1(Context context, ti2 ti2Var, ti2 ti2Var2) {
        qu5 qu5Var = new qu5();
        g50 g50Var = g50.a;
        qu5Var.a(ah0.class, g50Var);
        qu5Var.a(w70.class, g50Var);
        n50 n50Var = n50.a;
        qu5Var.a(zb6.class, n50Var);
        qu5Var.a(ba0.class, n50Var);
        h50 h50Var = h50.a;
        qu5Var.a(li2.class, h50Var);
        qu5Var.a(x70.class, h50Var);
        f50 f50Var = f50.a;
        qu5Var.a(bk.class, f50Var);
        qu5Var.a(u70.class, f50Var);
        m50 m50Var = m50.a;
        qu5Var.a(wb6.class, m50Var);
        qu5Var.a(aa0.class, m50Var);
        i50 i50Var = i50.a;
        qu5Var.a(ip2.class, i50Var);
        qu5Var.a(y70.class, i50Var);
        l50 l50Var = l50.a;
        qu5Var.a(i74.class, l50Var);
        qu5Var.a(t90.class, l50Var);
        k50 k50Var = k50.a;
        qu5Var.a(h74.class, k50Var);
        qu5Var.a(s90.class, k50Var);
        o50 o50Var = o50.a;
        qu5Var.a(yi7.class, o50Var);
        qu5Var.a(da0.class, o50Var);
        j50 j50Var = j50.a;
        qu5Var.a(l64.class, j50Var);
        qu5Var.a(r90.class, j50Var);
        qu5Var.d = true;
        this.a = new gi3(qu5Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(i51.c);
        this.e = ti2Var2;
        this.f = ti2Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(b00.h("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (((wi7) wi7.a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p90 a(p90 p90Var) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        o90 c = p90Var.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c.h;
        if (hashMap2 == null) {
            sc8.j("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        c.a("model", Build.MODEL);
        c.a("hardware", Build.HARDWARE);
        c.a("device", Build.DEVICE);
        c.a("product", Build.PRODUCT);
        c.a("os-uild", Build.ID);
        c.a("manufacturer", Build.MANUFACTURER);
        c.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c.h;
        if (hashMap3 == null) {
            sc8.j("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = xi7.a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c.h;
        if (hashMap4 == null) {
            sc8.j("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = wi7.a;
                subtype = 100;
            }
            hashMap = (HashMap) c.h;
            if (hashMap != null) {
                sc8.j("Property \"autoMetadata\" has not been set");
                return null;
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c.a("country", Locale.getDefault().getCountry());
            c.a("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            c.a("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                xne.b("CctTransportBackend", "Unable to find version code for package", e);
            }
            c.a("application_build", Integer.toString(i2));
            return c.b();
        }
        SparseArray sparseArray3 = wi7.a;
        subtype = 0;
        hashMap = (HashMap) c.h;
        if (hashMap != null) {
        }
    }
}
