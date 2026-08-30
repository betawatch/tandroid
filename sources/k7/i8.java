package k7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.am0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class i8 {
    public static void a(am0 am0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        am0Var.q(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q());
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
