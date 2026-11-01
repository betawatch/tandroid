package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yw0 extends org.telegram.ui.Cells.d8 {
    public final /* synthetic */ zw0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw0(zw0 zw0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, false);
        this.O = zw0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        zw0 zw0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(zw0Var.r.F1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(zw0Var.r.F1, TLObject.FLAG_30));
    }
}
