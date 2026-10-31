package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j6 extends t7 {
    public final /* synthetic */ int G = 0;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(zu zuVar, Context context, y6 y6Var) {
        super(context, y6Var, null, null);
        this.H = zuVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.i5 i5Var2;
        y6 y6Var = (y6) this.H;
        if (!z10) {
            i5Var = ((org.telegram.ui.ActionBar.k2) y6Var).simpleActionBar;
            i5Var.r();
            return;
        }
        fe.b bVar = y6Var.S;
        if (bVar != null) {
            bVar.a(true, true);
        }
        i5Var2 = ((org.telegram.ui.ActionBar.k2) y6Var).simpleActionBar;
        i5Var2.C();
    }

    @Override // org.telegram.ui.t7, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((zu) this.H).n1 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.m, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(y6 y6Var, Context context, y6 y6Var2, ei.r rVar, org.telegram.ui.Components.ku0 ku0Var) {
        super(context, y6Var2, rVar, ku0Var);
        this.H = y6Var;
    }
}
