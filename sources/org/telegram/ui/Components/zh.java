package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class zh extends s00 {
    public final di J;

    public zh(Context context, org.telegram.ui.ActionBar.f6 f6Var, di diVar) {
        super(context, f6Var);
        this.J = diVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.h1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
