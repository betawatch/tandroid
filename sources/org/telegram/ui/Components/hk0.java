package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hk0 extends mm0 {
    public final /* synthetic */ pk0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk0(pk0 pk0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f3 = pk0Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        pk0 pk0Var = this.f3;
        mb0 mb0Var = pk0Var.J;
        if (mb0Var != null) {
            mb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        pk0Var.j();
    }
}
