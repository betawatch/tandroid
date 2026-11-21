package c8;

import org.telegram.ui.Components.ok0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class ea {
    public static void a(ok0 ok0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        ok0Var.r(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var), h6Var != null ? h6Var.d() : org.telegram.ui.ActionBar.m6.I.q());
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
