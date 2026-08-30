package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h91 extends org.telegram.ui.Components.sl0 {
    public int U2;
    public final /* synthetic */ ga1 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h91(ga1 ga1Var, Context context) {
        super(context, null);
        this.V2 = ga1Var;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        l91 l91Var;
        super.onMeasure(i10, i11);
        if (this.U2 != getMeasuredHeight() && (l91Var = this.V2.U) != null) {
            l91Var.l();
        }
        this.U2 = getMeasuredHeight();
    }
}
