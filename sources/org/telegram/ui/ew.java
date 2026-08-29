package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ew extends org.telegram.ui.Components.f00 {
    public final /* synthetic */ fy x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(fy fyVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.x0 = fyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.x0.i3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
