package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class qx0 extends org.telegram.ui.Cells.f8 {
    public final /* synthetic */ rx0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx0(rx0 rx0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.O = rx0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        rx0 rx0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(rx0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(rx0Var.r.O, TLObject.FLAG_30));
    }
}
