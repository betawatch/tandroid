package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        if (this.e3.q1) {
            return;
        }
        super.requestLayout();
    }
}
