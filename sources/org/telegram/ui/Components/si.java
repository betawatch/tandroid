package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
