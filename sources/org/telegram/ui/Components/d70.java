package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class d70 extends org.telegram.ui.Cells.e9 {
    public final org.telegram.ui.Cells.t6 v;
    public boolean w;
    public final /* synthetic */ e70 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d70(e70 e70Var, Context context) {
        super(context);
        this.x = e70Var;
        this.v = new org.telegram.ui.Cells.t6(this, 16);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.t6 t6Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        if (this.w) {
            AndroidUtilities.runOnUIThread(t6Var, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
