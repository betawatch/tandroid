package c8;

import org.telegram.ui.Components.mk0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class ea {
    public static void a(mk0 mk0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        mk0Var.r(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var), i6Var != null ? i6Var.d() : org.telegram.ui.ActionBar.n6.I.q());
    }

    public static int b(oi.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(r4, 1, 24, 28)) : 0);
    }

    public static int c(oi.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(r3, 1, 16, 12));
    }

    public static int d(oi.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(r3, 1, 16, 8));
    }
}
