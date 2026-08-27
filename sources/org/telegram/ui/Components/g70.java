package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g70 extends zk0 {
    public final /* synthetic */ k70 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g70(k70 k70Var, Context context) {
        super(context, null);
        this.T2 = k70Var;
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T2.n) {
            return;
        }
        super.requestLayout();
    }
}
