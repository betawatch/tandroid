package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class jy0 extends org.telegram.ui.Cells.e8 {
    public final /* synthetic */ ky0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy0(ky0 ky0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = ky0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ky0 ky0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ky0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ky0Var.r.O, TLObject.FLAG_30));
    }
}
