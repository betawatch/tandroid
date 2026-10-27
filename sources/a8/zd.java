package a8;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class zd {
    public static void a(xm0 xm0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        xm0Var.r(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var), u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q());
    }

    public static int b(li.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? AndroidUtilities.dp(c3.h0.w(r4, 1, 24, 28)) : 0);
    }

    public static int c(li.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(c3.h0.w(r3, 1, 16, 12));
    }

    public static int d(li.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(c3.h0.w(r3, 1, 16, 8));
    }
}
