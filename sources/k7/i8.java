package k7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class i8 {
    public static void a(zl0 zl0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        zl0Var.q(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q());
    }

    public static int b(vh.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? AndroidUtilities.dp(e2.c.e(r4, 1, 24, 28)) : 0);
    }

    public static int c(vh.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(e2.c.e(r3, 1, 16, 12));
    }

    public static int d(vh.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(e2.c.e(r3, 1, 16, 8));
    }
}
