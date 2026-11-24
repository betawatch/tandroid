// default package

import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class o80 implements cq7 {
    public static final o80 a = new o80();
    public static final wa4 b = wa4.c("packageName");
    public static final wa4 c = wa4.c("versionName");
    public static final wa4 d = wa4.c("appBuildVersion");
    public static final wa4 e = wa4.c("deviceManufacturer");
    public static final wa4 f = wa4.c("currentProcessDetails");
    public static final wa4 g = wa4.c("appProcessDetails");

    @Override // b44
    public final void a(Object obj, Object obj2) {
        xk xkVar = (xk) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.a(b, xkVar.a);
        dq7Var.a(c, xkVar.b);
        dq7Var.a(d, xkVar.c);
        dq7Var.a(e, Build.MANUFACTURER);
        dq7Var.a(f, xkVar.d);
        dq7Var.a(g, xkVar.e);
    }
}
