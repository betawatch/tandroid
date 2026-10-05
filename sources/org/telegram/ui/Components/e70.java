package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class e70 extends org.telegram.ui.Cells.e9 {
    public final org.telegram.ui.Cells.t6 v;
    public boolean w;
    public final /* synthetic */ f70 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e70(f70 f70Var, Context context) {
        super(context);
        this.x = f70Var;
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
