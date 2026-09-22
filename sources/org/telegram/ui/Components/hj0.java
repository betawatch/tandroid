package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class hj0 extends ll0 {
    public final /* synthetic */ pj0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.X2 = pj0Var;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        pj0 pj0Var = this.X2;
        ta0 ta0Var = pj0Var.J;
        if (ta0Var != null) {
            ta0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        pj0Var.j();
    }
}
