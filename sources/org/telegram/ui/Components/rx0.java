package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class rx0 extends org.telegram.ui.Cells.f8 {
    public final /* synthetic */ sx0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx0(sx0 sx0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.O = sx0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        sx0 sx0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(sx0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(sx0Var.r.O, TLObject.FLAG_30));
    }
}
