package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ij0 extends ml0 {
    public final /* synthetic */ qj0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij0(qj0 qj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.X2 = qj0Var;
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        qj0 qj0Var = this.X2;
        ua0 ua0Var = qj0Var.J;
        if (ua0Var != null) {
            ua0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        qj0Var.j();
    }
}
