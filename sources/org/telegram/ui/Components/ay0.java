package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
