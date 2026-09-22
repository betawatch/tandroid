package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class b70 extends org.telegram.ui.Cells.f9 {
    public final org.telegram.ui.Cells.u6 v;
    public boolean w;
    public final /* synthetic */ c70 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(c70 c70Var, Context context) {
        super(context);
        this.x = c70Var;
        this.v = new org.telegram.ui.Cells.u6(this, 16);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.u6 u6Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(u6Var);
        if (this.w) {
            AndroidUtilities.runOnUIThread(u6Var, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
