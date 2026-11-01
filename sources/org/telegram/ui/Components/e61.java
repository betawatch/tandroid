package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e61 extends h10 {
    public final org.telegram.ui.ActionBar.n0 J;
    public final /* synthetic */ f61 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e61(f61 f61Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.K = f61Var;
        org.telegram.ui.ActionBar.n0 n0Var = this.r;
        this.J = n0Var;
        n0Var.setImeOptions(268435459);
        n0Var.setHint(org.telegram.messenger.dd.L0(2131743365, null));
        n0Var.addTextChangedListener(new ag.a1(this, 21));
        n0Var.setOnEditorActionListener(new t0(this, 11));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.J0(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
