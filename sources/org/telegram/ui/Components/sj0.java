package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class sj0 extends wl0 {
    public final /* synthetic */ ak0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj0(ak0 ak0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.X2 = ak0Var;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        ak0 ak0Var = this.X2;
        fb0 fb0Var = ak0Var.J;
        if (fb0Var != null) {
            fb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        ak0Var.j();
    }
}
