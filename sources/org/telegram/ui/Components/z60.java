package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z60 extends org.telegram.ui.Cells.f9 {
    public final org.telegram.ui.Cells.l9 v;
    public boolean w;
    public final /* synthetic */ a70 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(a70 a70Var, Context context) {
        super(context);
        this.x = a70Var;
        this.v = new org.telegram.ui.Cells.l9(this, 13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.l9 l9Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(l9Var);
        if (this.w) {
            AndroidUtilities.runOnUIThread(l9Var, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
