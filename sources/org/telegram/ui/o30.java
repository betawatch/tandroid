package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o30 extends org.telegram.ui.Cells.f4 {
    public final /* synthetic */ r30 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o30(r30 r30Var, Context context) {
        super(context);
        this.h0 = r30Var;
    }

    @Override // org.telegram.ui.Cells.f4
    public final void d(org.telegram.ui.Cells.f4 f4Var) {
        x30 x30Var = this.h0.N;
        x30 x30Var2 = x30.v5;
        x30Var.I1(f4Var);
    }

    @Override // org.telegram.ui.Cells.f4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        if (org.telegram.messenger.g0.Q1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(420.0f), View.MeasureSpec.getSize(i3)), TLObject.FLAG_30), i10);
        } else {
            super.onMeasure(i3, i10);
        }
    }
}
