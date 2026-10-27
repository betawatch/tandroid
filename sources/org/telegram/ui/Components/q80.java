package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q80 extends nm0 {
    public final /* synthetic */ u80 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q80(u80 u80Var, Context context) {
        super(context, null);
        this.f3 = u80Var;
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.s) {
            return;
        }
        super.requestLayout();
    }
}
