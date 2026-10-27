package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ik0 extends nm0 {
    public final /* synthetic */ qk0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik0(qk0 qk0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f3 = qk0Var;
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        qk0 qk0Var = this.f3;
        nb0 nb0Var = qk0Var.J;
        if (nb0Var != null) {
            nb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        qk0Var.j();
    }
}
