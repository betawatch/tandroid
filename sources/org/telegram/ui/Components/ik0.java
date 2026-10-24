package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ik0 extends mm0 {
    public final /* synthetic */ qk0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik0(qk0 qk0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.Y2 = qk0Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        qk0 qk0Var = this.Y2;
        pb0 pb0Var = qk0Var.J;
        if (pb0Var != null) {
            pb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        qk0Var.j();
    }
}
