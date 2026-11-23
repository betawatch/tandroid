package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class c41 extends org.telegram.ui.Components.ek0 {
    public int f3;
    public final /* synthetic */ c51 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(c51 c51Var, Context context) {
        super(context, null);
        this.g3 = c51Var;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        h41 h41Var;
        super.onMeasure(i7, i10);
        if (this.f3 != getMeasuredHeight() && (h41Var = this.g3.X) != null) {
            h41Var.f();
        }
        this.f3 = getMeasuredHeight();
    }
}
