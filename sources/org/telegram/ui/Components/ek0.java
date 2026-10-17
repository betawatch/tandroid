package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ek0 extends im0 {
    public final /* synthetic */ mk0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek0(mk0 mk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.V2 = mk0Var;
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        mk0 mk0Var = this.V2;
        ob0 ob0Var = mk0Var.J;
        if (ob0Var != null) {
            ob0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        mk0Var.j();
    }
}
