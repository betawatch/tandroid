package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class r60 extends org.telegram.ui.Cells.f9 {
    public final org.telegram.ui.Cells.l7 v;
    public boolean w;
    public final /* synthetic */ s60 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(s60 s60Var, Context context) {
        super(context);
        this.x = s60Var;
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
