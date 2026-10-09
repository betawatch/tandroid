package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ca1 extends org.telegram.ui.Components.qm0 {
    public int V2;
    public final /* synthetic */ bb1 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca1(bb1 bb1Var, Context context) {
        super(context, null);
        this.W2 = bb1Var;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        ga1 ga1Var;
        super.onMeasure(i10, i11);
        if (this.V2 != getMeasuredHeight() && (ga1Var = this.W2.X) != null) {
            ga1Var.l();
        }
        this.V2 = getMeasuredHeight();
    }
}
