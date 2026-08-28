package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c70 extends wk0 {
    public final /* synthetic */ g70 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c70(g70 g70Var, Context context) {
        super(context, null);
        this.T2 = g70Var;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T2.n) {
            return;
        }
        super.requestLayout();
    }
}
