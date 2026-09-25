package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class si extends c20 {
    public final wi J;

    public si(Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var);
        this.J = wiVar;
    }

    @Override // org.telegram.ui.Components.c20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.t1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
