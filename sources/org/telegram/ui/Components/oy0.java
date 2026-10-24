package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class oy0 extends org.telegram.ui.Cells.e8 {
    public final /* synthetic */ py0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy0(py0 py0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.O = py0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        py0 py0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(py0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(py0Var.r.O, TLObject.FLAG_30));
    }
}
