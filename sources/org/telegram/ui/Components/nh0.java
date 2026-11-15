package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class nh0 extends uj0 {
    public final /* synthetic */ vh0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh0(vh0 vh0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f3 = vh0Var;
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        vh0 vh0Var = this.f3;
        o90 o90Var = vh0Var.K;
        if (o90Var != null) {
            o90Var.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i7, i10);
        vh0Var.j();
    }
}
