package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class n80 extends im0 {
    public final /* synthetic */ r80 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n80(r80 r80Var, Context context) {
        super(context, null);
        this.V2 = r80Var;
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2.n) {
            return;
        }
        super.requestLayout();
    }
}
