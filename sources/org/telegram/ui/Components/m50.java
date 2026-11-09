package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m50 extends org.telegram.ui.Cells.z8 {
    public final /* synthetic */ n50 D;
    public final et x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(n50 n50Var, Context context) {
        super(context);
        this.D = n50Var;
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
