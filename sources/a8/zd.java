package a8;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wm0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class zd {
    public static void a(wm0 wm0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        wm0Var.r(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var), u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q());
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
