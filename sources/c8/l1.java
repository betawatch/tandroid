package c8;

import org.telegram.ui.Components.zj0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class l1 {
    public static void a(zj0 zj0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        zj0Var.r(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var), h6Var != null ? h6Var.a() : org.telegram.ui.ActionBar.m6.I.q());
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
