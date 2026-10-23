package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class l70 extends org.telegram.ui.Cells.e9 {
    public final org.telegram.ui.Cells.u5 w;
    public boolean x;
    public final /* synthetic */ m70 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l70(m70 m70Var, Context context) {
        super(context);
        this.y = m70Var;
        this.w = new org.telegram.ui.Cells.u5(this, 16);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.u5 u5Var = this.w;
        AndroidUtilities.cancelRunOnUIThread(u5Var);
        if (this.x) {
            AndroidUtilities.runOnUIThread(u5Var, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.w);
    }
}
