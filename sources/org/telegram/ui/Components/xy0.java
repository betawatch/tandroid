package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xy0 extends org.telegram.ui.Cells.i8 {
    public final /* synthetic */ yy0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy0(yy0 yy0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, false);
        this.O = yy0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        yy0 yy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(yy0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(yy0Var.r.O, TLObject.FLAG_30));
    }
}
