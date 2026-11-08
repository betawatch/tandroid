package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class b41 extends org.telegram.ui.Components.pj0 {
    public int e3;
    public final /* synthetic */ c51 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(c51 c51Var, Context context) {
        super(context, null);
        this.f3 = c51Var;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        g41 g41Var;
        super.onMeasure(i7, i10);
        if (this.e3 != getMeasuredHeight() && (g41Var = this.f3.W) != null) {
            g41Var.f();
        }
        this.e3 = getMeasuredHeight();
    }
}
