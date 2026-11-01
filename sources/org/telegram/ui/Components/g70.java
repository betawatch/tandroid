package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g70 extends uk0 {
    public final /* synthetic */ k70 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g70(k70 k70Var, Context context) {
        super(context, null);
        this.e3 = k70Var;
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3.q1) {
            return;
        }
        super.requestLayout();
    }
}
