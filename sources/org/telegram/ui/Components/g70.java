package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g70 extends tk0 {
    public final /* synthetic */ k70 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g70(k70 k70Var, Context context) {
        super(context, null);
        this.e3 = k70Var;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3.q1) {
            return;
        }
        super.requestLayout();
    }
}
