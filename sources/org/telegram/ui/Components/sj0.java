package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class sj0 extends wl0 {
    public final /* synthetic */ ak0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj0(ak0 ak0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.X2 = ak0Var;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        ak0 ak0Var = this.X2;
        cb0 cb0Var = ak0Var.J;
        if (cb0Var != null) {
            cb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        ak0Var.j();
    }
}
