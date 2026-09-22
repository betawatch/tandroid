package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class aa1 extends org.telegram.ui.Components.ll0 {
    public int X2;
    public final /* synthetic */ za1 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa1(za1 za1Var, Context context) {
        super(context, null);
        this.Y2 = za1Var;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        ea1 ea1Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (ea1Var = this.Y2.X) != null) {
            ea1Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
