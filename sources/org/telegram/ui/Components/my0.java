package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class my0 extends org.telegram.ui.Cells.f8 {
    public final /* synthetic */ ny0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0(ny0 ny0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = ny0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ny0 ny0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ny0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ny0Var.r.O, TLObject.FLAG_30));
    }
}
