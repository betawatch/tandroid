package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ky0 extends org.telegram.ui.Cells.e8 {
    public final /* synthetic */ ly0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky0(ly0 ly0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = ly0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ly0 ly0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ly0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ly0Var.r.O, TLObject.FLAG_30));
    }
}
