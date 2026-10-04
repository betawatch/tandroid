package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ly0 extends org.telegram.ui.Cells.f8 {
    public final /* synthetic */ my0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly0(my0 my0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = my0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        my0 my0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(my0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(my0Var.r.O, TLObject.FLAG_30));
    }
}
