package k7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.am0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class l8 {
    public static void a(am0 am0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        am0Var.q(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var), g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.k6.I.q());
    }

    public static int b(wh.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? AndroidUtilities.dp(e2.c.e(r4, 1, 24, 28)) : 0);
    }

    public static int c(wh.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(e2.c.e(r3, 1, 16, 12));
    }

    public static int d(wh.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(e2.c.e(r3, 1, 16, 8));
    }
}
