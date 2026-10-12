package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ia1 extends org.telegram.ui.Components.mm0 {
    public int V2;
    public final /* synthetic */ hb1 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(hb1 hb1Var, Context context) {
        super(context, null);
        this.W2 = hb1Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        ma1 ma1Var;
        super.onMeasure(i10, i11);
        if (this.V2 != getMeasuredHeight() && (ma1Var = this.W2.X) != null) {
            ma1Var.l();
        }
        this.V2 = getMeasuredHeight();
    }
}
