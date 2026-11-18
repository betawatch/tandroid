package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class c41 extends org.telegram.ui.Components.ck0 {
    public int f3;
    public final /* synthetic */ c51 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(c51 c51Var, Context context) {
        super(context, null);
        this.g3 = c51Var;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        h41 h41Var;
        super.onMeasure(i7, i10);
        if (this.f3 != getMeasuredHeight() && (h41Var = this.g3.X) != null) {
            h41Var.f();
        }
        this.f3 = getMeasuredHeight();
    }
}
