package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class cy0 extends org.telegram.ui.Cells.f8 {
    public final /* synthetic */ dy0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy0(dy0 dy0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = dy0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        dy0 dy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dy0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dy0Var.r.O, TLObject.FLAG_30));
    }
}
