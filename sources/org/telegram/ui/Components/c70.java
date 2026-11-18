package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class c70 extends ck0 {
    public final /* synthetic */ g70 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c70(g70 g70Var, Context context) {
        super(context, null);
        this.f3 = g70Var;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.u1) {
            return;
        }
        super.requestLayout();
    }
}
