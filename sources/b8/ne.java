package b8;

import org.telegram.ui.Components.dk0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class ne {
    public static void a(dk0 dk0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        dk0Var.r(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var), e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.k6.I.q());
    }

    public static int b(mi.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r4, 1, 24, 28)) : 0);
    }

    public static int c(mi.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r3, 1, 16, 12));
    }

    public static int d(mi.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r3, 1, 16, 8));
    }
}
