package g7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class v6 {
    public static void a(dl0 dl0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        dl0Var.q(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var), b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q());
    }

    public static int b(qh.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? AndroidUtilities.dp(e2.c.e(r4, 1, 24, 28)) : 0);
    }

    public static int c(qh.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(e2.c.e(r3, 1, 16, 12));
    }

    public static int d(qh.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(e2.c.e(r3, 1, 16, 8));
    }
}
