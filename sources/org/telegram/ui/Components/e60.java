package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e60 extends org.telegram.ui.Cells.x8 {
    public final m.i3 v;
    public boolean w;
    public final /* synthetic */ f60 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e60(f60 f60Var, Context context) {
        super(context);
        this.x = f60Var;
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
