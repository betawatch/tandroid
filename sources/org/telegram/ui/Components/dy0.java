package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class dy0 extends org.telegram.ui.Cells.g8 {
    public final /* synthetic */ ey0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy0(ey0 ey0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.O = ey0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ey0 ey0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ey0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ey0Var.r.O, TLObject.FLAG_30));
    }
}
