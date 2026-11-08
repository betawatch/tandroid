package c8;

import org.telegram.ui.Components.zj0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
