package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class l50 extends org.telegram.ui.Cells.z8 {
    public final /* synthetic */ m50 D;
    public final et x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l50(m50 m50Var, Context context) {
        super(context);
        this.D = m50Var;
        this.x = new et(this, 6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        et etVar = this.x;
        org.telegram.messenger.g0.r(etVar);
        if (this.y) {
            org.telegram.messenger.g0.i3(etVar, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.x);
    }
}
