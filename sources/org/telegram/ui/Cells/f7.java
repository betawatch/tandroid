package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.ij;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class f7 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new f7());
    }

    public static x31 i(xe xeVar, d20 d20Var) {
        x31 K = x31.K(f7.class);
        K.G = xeVar;
        K.H = d20Var;
        return K;
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        g7 g7Var = (g7) view;
        Object obj = x31Var.G;
        if (obj instanceof ij) {
            g7Var.f((ij) obj, z9);
        } else if (obj instanceof xe) {
            xe xeVar = (xe) obj;
            g7Var.setTag(xeVar);
            g7Var.f(xeVar.e, z9);
        }
        Object obj2 = x31Var.H;
        if (obj2 instanceof d20) {
            g7Var.setNeedPlayMessageListener((d20) obj2);
        }
        g7Var.e(x31Var.e, false);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean c(x31 x31Var, x31 x31Var2) {
        return x31Var.d == x31Var2.d && x31Var.G == x31Var2.G;
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        g7 g7Var = new g7(0, context, f6Var);
        g7Var.setCheckForButtonPress(true);
        return g7Var;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        return x31Var.d == x31Var2.d && x31Var.G == x31Var2.G;
    }
}
