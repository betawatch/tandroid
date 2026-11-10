package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d41 extends org.telegram.ui.Components.pj0 {
    public int e3;
    public final /* synthetic */ e51 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d41(e51 e51Var, Context context) {
        super(context, null);
        this.f3 = e51Var;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        i41 i41Var;
        super.onMeasure(i7, i10);
        if (this.e3 != getMeasuredHeight() && (i41Var = this.f3.W) != null) {
            i41Var.f();
        }
        this.e3 = getMeasuredHeight();
    }
}
