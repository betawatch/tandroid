// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class c60 implements zn7 {
    public static final c60 a = new c60();
    public static final w84 b = w84.c("baseAddress");
    public static final w84 c = w84.c("size");
    public static final w84 d = w84.c("name");
    public static final w84 e = w84.c("uuid");

    @Override // q24
    public final void a(Object obj, Object obj2) {
        qy2 qy2Var = (qy2) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.g(b, ((v80) qy2Var).a);
        v80 v80Var = (v80) qy2Var;
        ao7Var.g(c, v80Var.b);
        ao7Var.a(d, v80Var.c);
        String str = v80Var.d;
        ao7Var.a(e, str != null ? str.getBytes(hz2.a) : null);
    }
}
