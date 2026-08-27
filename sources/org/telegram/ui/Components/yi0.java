package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yi0 extends zk0 {
    public final /* synthetic */ gj0 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi0(gj0 gj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = gj0Var;
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        gj0 gj0Var = this.T2;
        ga0 ga0Var = gj0Var.F;
        if (ga0Var != null) {
            ga0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        gj0Var.j();
    }
}
