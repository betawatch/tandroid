package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yy0 extends org.telegram.ui.Cells.i8 {
    public final /* synthetic */ zy0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy0(zy0 zy0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, false);
        this.O = zy0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        zy0 zy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(zy0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(zy0Var.r.O, TLObject.FLAG_30));
    }
}
