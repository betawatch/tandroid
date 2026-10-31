package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ni0 extends tk0 {
    public final /* synthetic */ vi0 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni0(vi0 vi0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.e3 = vi0Var;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        vi0 vi0Var = this.e3;
        da0 da0Var = vi0Var.J;
        if (da0Var != null) {
            da0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        vi0Var.j();
    }
}
