// default package

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f8a {
    public static final f8a a = new f8a();
    public static final lj4 b;

    static {
        qw5 qw5Var = new qw5();
        qw5Var.a(e8a.class, s80.a);
        qw5Var.a(k8a.class, t80.a);
        qw5Var.a(m73.class, q80.a);
        qw5Var.a(ss.class, p80.a);
        qw5Var.a(xk.class, o80.a);
        qw5Var.a(bn8.class, r80.a);
        qw5Var.d = true;
        b = new lj4(qw5Var);
    }

    public static ss a(li4 li4Var) {
        li4Var.a();
        Context context = li4Var.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        li4Var.a();
        String str = li4Var.c.b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = valueOf;
        }
        Build.MANUFACTURER.getClass();
        li4Var.a();
        bn8 f = s4.f(context);
        li4Var.a();
        return new ss(str, new xk(packageName, str2, valueOf, f, s4.c(context)));
    }
}
