package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class oy0 extends org.telegram.ui.Cells.f8 {
    public final /* synthetic */ py0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy0(py0 py0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.O = py0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        py0 py0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(py0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(py0Var.r.O, TLObject.FLAG_30));
    }
}
