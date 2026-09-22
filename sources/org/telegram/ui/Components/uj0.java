package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class uj0 extends yl0 {
    public final /* synthetic */ ck0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj0(ck0 ck0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = ck0Var;
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        ck0 ck0Var = this.X2;
        eb0 eb0Var = ck0Var.J;
        if (eb0Var != null) {
            eb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        ck0Var.j();
    }
}
