package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class aa1 extends org.telegram.ui.Components.wl0 {
    public int X2;
    public final /* synthetic */ za1 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa1(za1 za1Var, Context context) {
        super(context, null);
        this.Y2 = za1Var;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        ea1 ea1Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (ea1Var = this.Y2.X) != null) {
            ea1Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
