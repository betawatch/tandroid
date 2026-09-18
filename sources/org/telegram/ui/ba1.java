package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ba1 extends org.telegram.ui.Components.ml0 {
    public int X2;
    public final /* synthetic */ ab1 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba1(ab1 ab1Var, Context context) {
        super(context, null);
        this.Y2 = ab1Var;
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        fa1 fa1Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (fa1Var = this.Y2.X) != null) {
            fa1Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
