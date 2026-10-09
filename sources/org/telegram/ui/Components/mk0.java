package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mk0 extends qm0 {
    public final /* synthetic */ uk0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk0(uk0 uk0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.V2 = uk0Var;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        uk0 uk0Var = this.V2;
        vb0 vb0Var = uk0Var.J;
        if (vb0Var != null) {
            vb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        uk0Var.j();
    }
}
