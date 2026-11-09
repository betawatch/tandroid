package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c41 extends org.telegram.ui.Components.qj0 {
    public int e3;
    public final /* synthetic */ d51 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(d51 d51Var, Context context) {
        super(context, null);
        this.f3 = d51Var;
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        h41 h41Var;
        super.onMeasure(i7, i10);
        if (this.e3 != getMeasuredHeight() && (h41Var = this.f3.W) != null) {
            h41Var.f();
        }
        this.e3 = getMeasuredHeight();
    }
}
