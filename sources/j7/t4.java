package j7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t4 implements s9.d {
    public static final t4 a = new t4();
    public static final s9.c b = new s9.c("inferenceCommonLogEvent", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(1))));
    public static final s9.c c = new s9.c("options", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(2))));
    public static final s9.c d = new s9.c("imageInfo", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(3))));
    public static final s9.c e = new s9.c("labelCount", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(4))));
    public static final s9.c f = new s9.c("highestConfidence", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(5))));

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        l8 l8Var = (l8) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(b, l8Var.a);
        eVar.e(c, l8Var.b);
        eVar.e(d, l8Var.c);
        eVar.e(e, null);
        eVar.e(f, null);
    }
}
