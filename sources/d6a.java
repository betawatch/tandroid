// default package

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class d6a {
    public static final d6a a = new d6a();
    public static final gi3 b;

    static {
        qu5 qu5Var = new qu5();
        qu5Var.a(c6a.class, s70.a);
        qu5Var.a(i6a.class, t70.a);
        qu5Var.a(a63.class, q70.a);
        qu5Var.a(sr.class, p70.a);
        qu5Var.a(xj.class, o70.a);
        qu5Var.a(zk8.class, r70.a);
        qu5Var.d = true;
        b = new gi3(qu5Var);
    }

    public static sr a(jg4 jg4Var) {
        jg4Var.a();
        Context context = jg4Var.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        jg4Var.a();
        String str = jg4Var.c.b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = valueOf;
        }
        Build.MANUFACTURER.getClass();
        jg4Var.a();
        zk8 f = s4.f(context);
        jg4Var.a();
        return new sr(str, new xj(packageName, str2, valueOf, f, s4.c(context)));
    }
}
