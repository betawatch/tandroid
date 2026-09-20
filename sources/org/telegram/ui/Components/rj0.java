package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class rj0 extends vl0 {
    public final /* synthetic */ zj0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj0(zj0 zj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = zj0Var;
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        zj0 zj0Var = this.X2;
        bb0 bb0Var = zj0Var.J;
        if (bb0Var != null) {
            bb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        zj0Var.j();
    }
}
