package j7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class z1 implements s9.d {
    public static final z1 a = new z1();
    public static final s9.c b = new s9.c("errorCode", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(1))));
    public static final s9.c c = new s9.c("isColdCall", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(2))));
    public static final s9.c d = new s9.c("imageInfo", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(3))));
    public static final s9.c e = new s9.c("detectorOptions", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(4))));

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        w0 w0Var = (w0) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(b, w0Var.a);
        eVar.e(c, w0Var.b);
        eVar.e(d, null);
        eVar.e(e, w0Var.c);
    }
}
