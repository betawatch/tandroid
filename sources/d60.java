// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class d60 implements zn7 {
    public static final d60 a = new d60();
    public static final w84 b = w84.c("threads");
    public static final w84 c = w84.c("exception");
    public static final w84 d = w84.c("appExitInfo");
    public static final w84 e = w84.c("profilingManagerInfo");
    public static final w84 f = w84.c("signal");
    public static final w84 g = w84.c("binaries");

    @Override // q24
    public final void a(Object obj, Object obj2) {
        vy2 vy2Var = (vy2) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.a(b, ((u80) vy2Var).a);
        u80 u80Var = (u80) vy2Var;
        ao7Var.a(c, u80Var.b);
        ao7Var.a(d, u80Var.c);
        ao7Var.a(e, u80Var.d);
        ao7Var.a(f, u80Var.e);
        ao7Var.a(g, u80Var.f);
    }
}
