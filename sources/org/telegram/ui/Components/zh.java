package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
