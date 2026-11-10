package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i6 extends t7 {
    public final /* synthetic */ int G = 0;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(zt ztVar, Context context, y6 y6Var) {
        super(context, y6Var, null, null);
        this.H = ztVar;
    }

    public void f(boolean z9) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        y6 y6Var = (y6) this.H;
        if (!z9) {
            z4Var = ((org.telegram.ui.ActionBar.f2) y6Var).simpleActionBar;
            z4Var.t();
            return;
        }
        te.a aVar = y6Var.S;
        if (aVar != null) {
            aVar.a(true, true);
        }
        z4Var2 = ((org.telegram.ui.ActionBar.f2) y6Var).simpleActionBar;
        z4Var2.D();
    }

    @Override // org.telegram.ui.t7, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.G) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((((zt) this.H).q1 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(y6 y6Var, Context context, y6 y6Var2, oi.q qVar, org.telegram.ui.Components.it0 it0Var) {
        super(context, y6Var2, qVar, it0Var);
        this.H = y6Var;
    }
}
