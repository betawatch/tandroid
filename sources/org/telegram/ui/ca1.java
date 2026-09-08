package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ca1 extends org.telegram.ui.Components.ll0 {
    public int X2;
    public final /* synthetic */ bb1 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca1(bb1 bb1Var, Context context) {
        super(context, null);
        this.Y2 = bb1Var;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        ga1 ga1Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (ga1Var = this.Y2.X) != null) {
            ga1Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
