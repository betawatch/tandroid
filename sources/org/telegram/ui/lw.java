package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class lw extends org.telegram.ui.Components.r00 {
    public lw(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || getAlpha() >= 0.25f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}
