package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class k70 extends org.telegram.ui.Cells.d9 {
    public final org.telegram.ui.Cells.k7 v;
    public boolean w;
    public final /* synthetic */ l70 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k70(l70 l70Var, Context context) {
        super(context);
        this.x = l70Var;
        this.v = new org.telegram.ui.Cells.k7(this, 14);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.k7 k7Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(k7Var);
        if (this.w) {
            AndroidUtilities.runOnUIThread(k7Var, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
