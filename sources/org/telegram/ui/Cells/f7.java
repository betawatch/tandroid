package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.ve;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f7 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new f7());
    }

    public static l41 i(ve veVar, y10 y10Var) {
        l41 K = l41.K(f7.class);
        K.H = veVar;
        K.I = y10Var;
        return K;
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        g7 g7Var = (g7) view;
        Object obj = l41Var.H;
        if (obj instanceof fj) {
            g7Var.f((fj) obj, z10);
        } else if (obj instanceof ve) {
            ve veVar = (ve) obj;
            g7Var.setTag(veVar);
            g7Var.f(veVar.e, z10);
        }
        Object obj2 = l41Var.I;
        if (obj2 instanceof y10) {
            g7Var.setNeedPlayMessageListener((y10) obj2);
        }
        g7Var.e(l41Var.e, false);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean c(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d && l41Var.H == l41Var2.H;
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        g7 g7Var = new g7(0, context, i6Var);
        g7Var.setCheckForButtonPress(true);
        return g7Var;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean e(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d && l41Var.H == l41Var2.H;
    }
}
