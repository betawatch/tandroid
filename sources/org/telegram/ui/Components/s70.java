package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s70 extends ml0 {
    public final /* synthetic */ w70 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s70(w70 w70Var, Context context) {
        super(context, null);
        this.X2 = w70Var;
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2.n) {
            return;
        }
        super.requestLayout();
    }
}
