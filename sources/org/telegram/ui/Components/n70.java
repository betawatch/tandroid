package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n70 extends org.telegram.ui.Cells.i9 {
    public final m.g3 w;
    public boolean x;
    public final /* synthetic */ o70 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n70(o70 o70Var, Context context) {
        super(context);
        this.y = o70Var;
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
