package c8;

import org.telegram.ui.Components.zj0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class l1 {
    public static void a(zj0 zj0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        zj0Var.r(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var), f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.k6.I.q());
    }

    public static int b(li.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r4, 1, 24, 28)) : 0);
    }

    public static int c(li.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r3, 1, 16, 12));
    }

    public static int d(li.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r3, 1, 16, 8));
    }
}
