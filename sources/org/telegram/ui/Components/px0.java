package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class px0 extends org.telegram.ui.Cells.f8 {
    public final /* synthetic */ qx0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px0(qx0 qx0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.O = qx0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        qx0 qx0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(qx0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(qx0Var.r.O, TLObject.FLAG_30));
    }
}
