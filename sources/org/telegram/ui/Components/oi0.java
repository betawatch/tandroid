package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class oi0 extends uk0 {
    public final /* synthetic */ wi0 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi0(wi0 wi0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.e3 = wi0Var;
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        wi0 wi0Var = this.e3;
        da0 da0Var = wi0Var.J;
        if (da0Var != null) {
            da0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        wi0Var.j();
    }
}
