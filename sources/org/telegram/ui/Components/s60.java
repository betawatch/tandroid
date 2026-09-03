package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s60 extends org.telegram.ui.Cells.z8 {
    public final m2.b v;
    public boolean w;
    public final /* synthetic */ t60 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(t60 t60Var, Context context) {
        super(context);
        this.x = t60Var;
        this.v = new m2.b(this, 24);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2.b bVar = this.v;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        if (this.w) {
            AndroidUtilities.runOnUIThread(bVar, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
