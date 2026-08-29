package j7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class y1 implements s9.d {
    public static final y1 a = new y1();
    public static final s9.c b = new s9.c("logEventKey", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(1))));
    public static final s9.c c = new s9.c("eventCount", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(2))));
    public static final s9.c d = new s9.c("inferenceDurationStats", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(3))));

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(b, x0Var.a);
        eVar.e(c, x0Var.b);
        eVar.e(d, x0Var.c);
    }
}
