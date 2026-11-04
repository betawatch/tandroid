package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.qe;
import org.telegram.messenger.v10;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e7 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new e7());
    }

    public static r31 i(qe qeVar, v10 v10Var) {
        r31 K = r31.K(e7.class);
        K.G = qeVar;
        K.H = v10Var;
        return K;
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        f7 f7Var = (f7) view;
        Object obj = r31Var.G;
        if (obj instanceof zi) {
            f7Var.f((zi) obj, z10);
        } else if (obj instanceof qe) {
            qe qeVar = (qe) obj;
            f7Var.setTag(qeVar);
            f7Var.f(qeVar.e, z10);
        }
        Object obj2 = r31Var.H;
        if (obj2 instanceof v10) {
            f7Var.setNeedPlayMessageListener((v10) obj2);
        }
        f7Var.e(r31Var.e, false);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return r31Var.d == r31Var2.d && r31Var.G == r31Var2.G;
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        f7 f7Var = new f7(0, context, e6Var);
        f7Var.setCheckForButtonPress(true);
        return f7Var;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        return r31Var.d == r31Var2.d && r31Var.G == r31Var2.G;
    }
}
