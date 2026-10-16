package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class r80 extends mm0 {
    public final /* synthetic */ v80 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r80(v80 v80Var, Context context) {
        super(context, null);
        this.V2 = v80Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2.n) {
            return;
        }
        super.requestLayout();
    }
}
