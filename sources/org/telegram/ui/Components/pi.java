package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class pi extends k20 {
    public final ti J;

    public pi(Context context, org.telegram.ui.ActionBar.g6 g6Var, ti tiVar) {
        super(context, g6Var);
        this.J = tiVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.z1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
