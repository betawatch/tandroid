package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class cy0 extends org.telegram.ui.Cells.f8 {
    public final /* synthetic */ dy0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy0(dy0 dy0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.O = dy0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        dy0 dy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dy0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dy0Var.r.O, TLObject.FLAG_30));
    }
}
