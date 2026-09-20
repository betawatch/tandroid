package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class y60 extends org.telegram.ui.Cells.f9 {
    public final org.telegram.ui.Cells.u6 v;
    public boolean w;
    public final /* synthetic */ z60 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y60(z60 z60Var, Context context) {
        super(context);
        this.x = z60Var;
        this.v = new org.telegram.ui.Cells.u6(this, 17);
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
