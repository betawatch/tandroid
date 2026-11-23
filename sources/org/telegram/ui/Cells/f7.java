package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.ve;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f7 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new f7());
    }

    public static n41 i(ve veVar, x10 x10Var) {
        n41 K = n41.K(f7.class);
        K.H = veVar;
        K.I = x10Var;
        return K;
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        g7 g7Var = (g7) view;
        Object obj = n41Var.H;
        if (obj instanceof fj) {
            g7Var.f((fj) obj, z10);
        } else if (obj instanceof ve) {
            ve veVar = (ve) obj;
            g7Var.setTag(veVar);
            g7Var.f(veVar.e, z10);
        }
        Object obj2 = n41Var.I;
        if (obj2 instanceof x10) {
            g7Var.setNeedPlayMessageListener((x10) obj2);
        }
        g7Var.e(n41Var.e, false);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean c(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d && n41Var.H == n41Var2.H;
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        g7 g7Var = new g7(0, context, i6Var);
        g7Var.setCheckForButtonPress(true);
        return g7Var;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d && n41Var.H == n41Var2.H;
    }
}
