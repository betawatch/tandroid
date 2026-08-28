package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z50 extends org.telegram.ui.Cells.b9 {
    public final m.i3 v;
    public boolean w;
    public final /* synthetic */ a60 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(a60 a60Var, Context context) {
        super(context);
        this.x = a60Var;
        this.v = new m.i3(this, 22);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.i3 i3Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        if (this.w) {
            AndroidUtilities.runOnUIThread(i3Var, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
