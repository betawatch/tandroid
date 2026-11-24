// default package

import android.os.Build;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o70 implements zn7 {
    public static final o70 a = new o70();
    public static final w84 b = w84.c("packageName");
    public static final w84 c = w84.c("versionName");
    public static final w84 d = w84.c("appBuildVersion");
    public static final w84 e = w84.c("deviceManufacturer");
    public static final w84 f = w84.c("currentProcessDetails");
    public static final w84 g = w84.c("appProcessDetails");

    @Override // q24
    public final void a(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.a(b, xjVar.a);
        ao7Var.a(c, xjVar.b);
        ao7Var.a(d, xjVar.c);
        ao7Var.a(e, Build.MANUFACTURER);
        ao7Var.a(f, xjVar.d);
        ao7Var.a(g, xjVar.e);
    }
}
