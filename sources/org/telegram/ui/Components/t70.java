package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class t70 extends ml0 {
    public final /* synthetic */ x70 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(x70 x70Var, Context context) {
        super(context, null);
        this.X2 = x70Var;
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2.n) {
            return;
        }
        super.requestLayout();
    }
}
