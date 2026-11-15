package c8;

import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class ca {
    public static void a(ek0 ek0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        ek0Var.r(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var), e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q());
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
