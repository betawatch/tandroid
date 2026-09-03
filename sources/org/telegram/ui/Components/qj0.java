package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qj0 extends rl0 {
    public final /* synthetic */ yj0 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj0(yj0 yj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U2 = yj0Var;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        yj0 yj0Var = this.U2;
        wa0 wa0Var = yj0Var.G;
        if (wa0Var != null) {
            wa0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        yj0Var.j();
    }
}
