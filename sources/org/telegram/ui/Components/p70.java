package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p70 extends jl0 {
    public final /* synthetic */ t70 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p70(t70 t70Var, Context context) {
        super(context, null);
        this.T2 = t70Var;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T2.n) {
            return;
        }
        super.requestLayout();
    }
}
