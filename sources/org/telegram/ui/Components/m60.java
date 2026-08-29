package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m60 extends org.telegram.ui.Cells.y8 {
    public final lh.m7 v;
    public boolean w;
    public final /* synthetic */ n60 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m60(n60 n60Var, Context context) {
        super(context);
        this.x = n60Var;
        this.v = new lh.m7(this, 25);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lh.m7 m7Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(m7Var);
        if (this.w) {
            AndroidUtilities.runOnUIThread(m7Var, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
