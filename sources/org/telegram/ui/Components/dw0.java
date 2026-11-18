package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dw0 extends org.telegram.ui.Cells.z7 {
    public final /* synthetic */ ew0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw0(ew0 ew0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, false);
        this.P = ew0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ew0 ew0Var = this.P;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ew0Var.r.J1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ew0Var.r.J1, TLObject.FLAG_30));
    }
}
