package i7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ql0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class x7 {
    public static void a(ql0 ql0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        ql0Var.q(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q());
    }

    public static int b(th.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(r4, 1, 24, 28)) : 0);
    }

    public static int c(th.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(r3, 1, 16, 12));
    }

    public static int d(th.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(r3, 1, 16, 8));
    }
}
