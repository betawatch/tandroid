package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
