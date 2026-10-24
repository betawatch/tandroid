package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class oy0 extends org.telegram.ui.Cells.e8 {
    public final /* synthetic */ py0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy0(py0 py0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.O = py0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        py0 py0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(py0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(py0Var.r.O, TLObject.FLAG_30));
    }
}
