package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class cw extends org.telegram.ui.Components.s00 {
    public final /* synthetic */ ey B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(ey eyVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.B0 = eyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.n3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
