package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class dw0 extends org.telegram.ui.Cells.a8 {
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
