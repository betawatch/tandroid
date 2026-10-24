package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
