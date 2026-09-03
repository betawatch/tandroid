package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sx0 extends org.telegram.ui.Cells.c8 {
    public final /* synthetic */ tx0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx0(tx0 tx0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.L = tx0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        tx0 tx0Var = this.L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(tx0Var.r.L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(tx0Var.r.L, TLObject.FLAG_30));
    }
}
