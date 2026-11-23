package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class z50 extends org.telegram.ui.Cells.a9 {
    public final /* synthetic */ a60 E;
    public final ik x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(a60 a60Var, Context context) {
        super(context);
        this.E = a60Var;
        this.x = new ik(this, 9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ik ikVar = this.x;
        org.telegram.messenger.g0.r(ikVar);
        if (this.y) {
            org.telegram.messenger.g0.h3(ikVar, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.x);
    }
}
