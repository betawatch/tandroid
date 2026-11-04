package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sv0 extends org.telegram.ui.Cells.y7 {
    public final /* synthetic */ tv0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(tv0 tv0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.P = tv0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        tv0 tv0Var = this.P;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(tv0Var.r.G1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(tv0Var.r.G1, TLObject.FLAG_30));
    }
}
