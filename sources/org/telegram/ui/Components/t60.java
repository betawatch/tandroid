package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
