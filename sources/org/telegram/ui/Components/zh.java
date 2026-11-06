package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
