package k7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bm0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class l8 {
    public static void a(bm0 bm0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        bm0Var.q(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var), g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.k6.I.q());
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
