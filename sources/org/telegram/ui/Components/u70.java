package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u70 extends sl0 {
    public final /* synthetic */ y70 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(y70 y70Var, Context context) {
        super(context, null);
        this.U2 = y70Var;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2.n) {
            return;
        }
        super.requestLayout();
    }
}
