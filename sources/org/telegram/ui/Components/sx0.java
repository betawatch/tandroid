package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sx0 extends org.telegram.ui.Cells.d8 {
    public final /* synthetic */ tx0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx0(tx0 tx0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.L = tx0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        tx0 tx0Var = this.L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(tx0Var.r.L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(tx0Var.r.L, TLObject.FLAG_30));
    }
}
