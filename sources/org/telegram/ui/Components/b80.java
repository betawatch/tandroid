package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class b80 extends wl0 {
    public final /* synthetic */ f80 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(f80 f80Var, Context context) {
        super(context, null);
        this.X2 = f80Var;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2.n) {
            return;
        }
        super.requestLayout();
    }
}
