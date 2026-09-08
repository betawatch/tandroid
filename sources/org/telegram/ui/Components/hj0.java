package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hj0 extends ll0 {
    public final /* synthetic */ pj0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = pj0Var;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        pj0 pj0Var = this.X2;
        ua0 ua0Var = pj0Var.J;
        if (ua0Var != null) {
            ua0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        pj0Var.j();
    }
}
