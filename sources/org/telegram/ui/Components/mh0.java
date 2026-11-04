package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mh0 extends tj0 {
    public final /* synthetic */ uh0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh0(uh0 uh0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f3 = uh0Var;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        uh0 uh0Var = this.f3;
        h90 h90Var = uh0Var.K;
        if (h90Var != null) {
            h90Var.measure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i3, i10);
        uh0Var.j();
    }
}
