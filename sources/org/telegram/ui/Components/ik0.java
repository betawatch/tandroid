package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ik0 extends mm0 {
    public final /* synthetic */ qk0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik0(qk0 qk0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.V2 = qk0Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        qk0 qk0Var = this.V2;
        ub0 ub0Var = qk0Var.J;
        if (ub0Var != null) {
            ub0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        qk0Var.j();
    }
}
