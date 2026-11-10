package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p60 extends pj0 {
    public final /* synthetic */ t60 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p60(t60 t60Var, Context context) {
        super(context, null);
        this.e3 = t60Var;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3.t1) {
            return;
        }
        super.requestLayout();
    }
}
