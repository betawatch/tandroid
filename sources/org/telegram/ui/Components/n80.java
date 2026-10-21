package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class n80 extends jm0 {
    public final /* synthetic */ r80 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n80(r80 r80Var, Context context) {
        super(context, null);
        this.V2 = r80Var;
    }

    @Override // org.telegram.ui.Components.jm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2.n) {
            return;
        }
        super.requestLayout();
    }
}
