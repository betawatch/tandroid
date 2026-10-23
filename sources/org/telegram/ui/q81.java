package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class q81 extends org.telegram.ui.Components.jm0 {
    public int V2;
    public final /* synthetic */ p91 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q81(p91 p91Var, Context context) {
        super(context, null);
        this.W2 = p91Var;
    }

    @Override // org.telegram.ui.Components.jm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        u81 u81Var;
        super.onMeasure(i10, i11);
        if (this.V2 != getMeasuredHeight() && (u81Var = this.W2.X) != null) {
            u81Var.l();
        }
        this.V2 = getMeasuredHeight();
    }
}
