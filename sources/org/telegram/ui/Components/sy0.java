package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sy0 extends org.telegram.ui.Cells.f8 {
    public final /* synthetic */ ty0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy0(ty0 ty0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.O = ty0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ty0 ty0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ty0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ty0Var.r.O, TLObject.FLAG_30));
    }
}
