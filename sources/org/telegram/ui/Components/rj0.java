package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rj0 extends sl0 {
    public final /* synthetic */ zj0 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj0(zj0 zj0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U2 = zj0Var;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        zj0 zj0Var = this.U2;
        xa0 xa0Var = zj0Var.G;
        if (xa0Var != null) {
            xa0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        zj0Var.j();
    }
}
