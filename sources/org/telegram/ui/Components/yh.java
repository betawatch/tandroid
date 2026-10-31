package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yh extends h10 {
    public final bi J;

    public yh(Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(context, p6Var);
        this.J = biVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.g1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
