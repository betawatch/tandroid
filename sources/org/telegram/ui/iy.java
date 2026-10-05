package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class iy extends org.telegram.ui.Components.f20 {
    public iy(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || getAlpha() >= 0.25f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}
