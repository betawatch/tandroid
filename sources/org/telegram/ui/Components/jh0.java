package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class jh0 extends pj0 {
    public final /* synthetic */ rh0 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh0(rh0 rh0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.e3 = rh0Var;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        rh0 rh0Var = this.e3;
        l90 l90Var = rh0Var.J;
        if (l90Var != null) {
            l90Var.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i7, i10);
        rh0Var.j();
    }
}
