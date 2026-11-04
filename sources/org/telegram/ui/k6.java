package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k6 extends u7 {
    public final /* synthetic */ int H = 1;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(ut utVar, Context context, z6 z6Var) {
        super(context, z6Var, null, null);
        this.I = utVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        z6 z6Var = (z6) this.I;
        if (!z10) {
            y4Var = ((org.telegram.ui.ActionBar.d2) z6Var).simpleActionBar;
            y4Var.r();
            return;
        }
        qe.a aVar = z6Var.T;
        if (aVar != null) {
            aVar.a(true, true);
        }
        y4Var2 = ((org.telegram.ui.ActionBar.d2) z6Var).simpleActionBar;
        y4Var2.B();
    }

    @Override // org.telegram.ui.u7, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.H) {
            case 1:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((((ut) this.I).o1 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(z6 z6Var, Context context, z6 z6Var2, pi.q qVar, org.telegram.ui.Components.gt0 gt0Var) {
        super(context, z6Var2, qVar, gt0Var);
        this.I = z6Var;
    }
}
