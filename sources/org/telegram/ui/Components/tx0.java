package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class tx0 extends org.telegram.ui.Cells.d8 {
    public final /* synthetic */ ux0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx0(ux0 ux0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.L = ux0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ux0 ux0Var = this.L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ux0Var.r.L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ux0Var.r.L, TLObject.FLAG_30));
    }
}
