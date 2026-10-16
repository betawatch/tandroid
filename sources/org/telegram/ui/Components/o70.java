package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class o70 extends org.telegram.ui.Cells.e9 {
    public final org.telegram.ui.Cells.l7 v;
    public boolean w;
    public final /* synthetic */ p70 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(p70 p70Var, Context context) {
        super(context);
        this.x = p70Var;
        this.v = new org.telegram.ui.Cells.l7(this, 14);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.l7 l7Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        if (this.w) {
            AndroidUtilities.runOnUIThread(l7Var, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
