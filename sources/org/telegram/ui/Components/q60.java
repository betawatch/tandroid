package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class q60 extends org.telegram.ui.Cells.e9 {
    public final org.telegram.ui.Cells.l7 v;
    public boolean w;
    public final /* synthetic */ r60 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(r60 r60Var, Context context) {
        super(context);
        this.x = r60Var;
        this.v = new org.telegram.ui.Cells.l7(this, 15);
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
