package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d61 extends h10 {
    public final org.telegram.ui.ActionBar.n0 J;
    public final /* synthetic */ e61 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(e61 e61Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.K = e61Var;
        org.telegram.ui.ActionBar.n0 n0Var = this.r;
        this.J = n0Var;
        n0Var.setImeOptions(268435459);
        n0Var.setHint(org.telegram.messenger.cd.L0(2131743365, null));
        n0Var.addTextChangedListener(new ag.a1(this, 21));
        n0Var.setOnEditorActionListener(new t0(this, 11));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.J0(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
