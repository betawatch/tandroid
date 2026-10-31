package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xw0 extends org.telegram.ui.Cells.d8 {
    public final /* synthetic */ yw0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw0(yw0 yw0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, false);
        this.O = yw0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        yw0 yw0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(yw0Var.r.F1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(yw0Var.r.F1, TLObject.FLAG_30));
    }
}
