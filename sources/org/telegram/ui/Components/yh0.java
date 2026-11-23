package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class yh0 extends ek0 {
    public final /* synthetic */ gi0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh0(gi0 gi0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f3 = gi0Var;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        gi0 gi0Var = this.f3;
        aa0 aa0Var = gi0Var.K;
        if (aa0Var != null) {
            aa0Var.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i7, i10);
        gi0Var.j();
    }
}
