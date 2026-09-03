package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t60 extends org.telegram.ui.Cells.a9 {
    public final m2.b v;
    public boolean w;
    public final /* synthetic */ u60 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(u60 u60Var, Context context) {
        super(context);
        this.x = u60Var;
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
