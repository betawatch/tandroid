package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class p80 extends mm0 {
    public final /* synthetic */ t80 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(t80 t80Var, Context context) {
        super(context, null);
        this.f3 = t80Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.s) {
            return;
        }
        super.requestLayout();
    }
}
