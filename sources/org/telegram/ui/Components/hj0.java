package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hj0 extends jl0 {
    public final /* synthetic */ pj0 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = pj0Var;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        pj0 pj0Var = this.T2;
        qa0 qa0Var = pj0Var.F;
        if (qa0Var != null) {
            qa0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        pj0Var.j();
    }
}
