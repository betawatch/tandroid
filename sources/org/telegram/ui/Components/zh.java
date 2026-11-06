package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class zh extends r00 {
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
