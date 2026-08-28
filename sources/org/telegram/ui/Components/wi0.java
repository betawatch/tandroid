package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wi0 extends wk0 {
    public final /* synthetic */ ej0 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi0(ej0 ej0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.T2 = ej0Var;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        ej0 ej0Var = this.T2;
        ca0 ca0Var = ej0Var.F;
        if (ca0Var != null) {
            ca0Var.measure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i9, i10);
        ej0Var.j();
    }
}
