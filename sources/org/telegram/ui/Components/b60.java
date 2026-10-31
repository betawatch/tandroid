package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b60 extends org.telegram.ui.Cells.b9 {
    public final /* synthetic */ c60 D;
    public final ew x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(c60 c60Var, Context context) {
        super(context);
        this.D = c60Var;
        this.x = new ew(this, 4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ew ewVar = this.x;
        org.telegram.messenger.i0.r(ewVar);
        if (this.y) {
            org.telegram.messenger.i0.h3(ewVar, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.i0.r(this.x);
    }
}
