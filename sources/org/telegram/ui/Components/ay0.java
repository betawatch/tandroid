package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ay0 extends org.telegram.ui.Cells.f8 {
    public final /* synthetic */ by0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay0(by0 by0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = by0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        by0 by0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(by0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(by0Var.r.O, TLObject.FLAG_30));
    }
}
