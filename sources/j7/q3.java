package j7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q3 implements s9.d {
    public static final q3 a = new q3();
    public static final s9.c b = new s9.c("imageFormat", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(1))));
    public static final s9.c c = new s9.c("originalImageSize", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(2))));
    public static final s9.c d = new s9.c("compressedImageSize", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(3))));
    public static final s9.c e = new s9.c("isOdmlImage", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(4))));

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        k7 k7Var = (k7) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(b, k7Var.a);
        eVar.e(c, k7Var.b);
        eVar.e(d, null);
        eVar.e(e, null);
    }
}
