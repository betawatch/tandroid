package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
