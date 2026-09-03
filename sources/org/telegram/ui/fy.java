package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fy extends org.telegram.ui.Components.d20 {
    public fy(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || getAlpha() >= 0.25f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}
