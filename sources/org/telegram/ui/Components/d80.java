package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class d80 extends wl0 {
    public final /* synthetic */ h80 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(h80 h80Var, Context context) {
        super(context, null);
        this.X2 = h80Var;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2.n) {
            return;
        }
        super.requestLayout();
    }
}
