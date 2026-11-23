package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yh0 extends ek0 {
    public final /* synthetic */ gi0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh0(gi0 gi0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f3 = gi0Var;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        gi0 gi0Var = this.f3;
        x90 x90Var = gi0Var.K;
        if (x90Var != null) {
            x90Var.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i7, i10);
        gi0Var.j();
    }
}
