package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b41 extends org.telegram.ui.Components.ek0 {
    public int f3;
    public final /* synthetic */ b51 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(b51 b51Var, Context context) {
        super(context, null);
        this.g3 = b51Var;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        g41 g41Var;
        super.onMeasure(i7, i10);
        if (this.f3 != getMeasuredHeight() && (g41Var = this.g3.X) != null) {
            g41Var.f();
        }
        this.f3 = getMeasuredHeight();
    }
}
