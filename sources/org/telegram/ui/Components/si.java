package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class si extends e20 {
    public final wi J;

    public si(Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var);
        this.J = wiVar;
    }

    @Override // org.telegram.ui.Components.e20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.t1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
