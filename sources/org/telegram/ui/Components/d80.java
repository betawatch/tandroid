package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class d80 extends yl0 {
    public final /* synthetic */ h80 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(h80 h80Var, Context context) {
        super(context, null);
        this.X2 = h80Var;
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2.n) {
            return;
        }
        super.requestLayout();
    }
}
