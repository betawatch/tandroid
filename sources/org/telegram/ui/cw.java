package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cw extends org.telegram.ui.Components.vz {
    public final /* synthetic */ dy x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(dy dyVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.x0 = dyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.x0.i3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
