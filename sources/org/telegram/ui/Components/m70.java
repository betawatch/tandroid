package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class m70 extends org.telegram.ui.Cells.i9 {
    public final m.g3 w;
    public boolean x;
    public final /* synthetic */ n70 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m70(n70 n70Var, Context context) {
        super(context);
        this.y = n70Var;
        this.w = new m.g3(this, 20);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.g3 g3Var = this.w;
        AndroidUtilities.cancelRunOnUIThread(g3Var);
        if (this.x) {
            AndroidUtilities.runOnUIThread(g3Var, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.w);
    }
}
