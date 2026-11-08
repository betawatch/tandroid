package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class lw extends org.telegram.ui.Components.s00 {
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
