package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ij0 extends ml0 {
    public final /* synthetic */ qj0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij0(qj0 qj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = qj0Var;
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        qj0 qj0Var = this.X2;
        ta0 ta0Var = qj0Var.J;
        if (ta0Var != null) {
            ta0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        qj0Var.j();
    }
}
