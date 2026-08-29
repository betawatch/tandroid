package j7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l3 implements s9.d {
    public static final l3 a = new l3();
    public static final s9.c b = new s9.c("maxMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(1))));
    public static final s9.c c = new s9.c("minMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(2))));
    public static final s9.c d = new s9.c("avgMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(3))));
    public static final s9.c e = new s9.c("firstQuartileMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(4))));
    public static final s9.c f = new s9.c("medianMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(5))));
    public static final s9.c g = new s9.c("thirdQuartileMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(6))));

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        g7 g7Var = (g7) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(b, g7Var.a);
        eVar.e(c, g7Var.b);
        eVar.e(d, g7Var.c);
        eVar.e(e, g7Var.d);
        eVar.e(f, g7Var.e);
        eVar.e(g, g7Var.f);
    }
}
