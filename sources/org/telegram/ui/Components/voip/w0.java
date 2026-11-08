package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w0 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public boolean b;
    public final /* synthetic */ zb1 c;

    public w0(zb1 zb1Var) {
        this.c = zb1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a = true;
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y10 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(x10) / 3.0f > y10 && this.a && !this.b) {
            this.a = false;
            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, x10, 2);
            zb1 zb1Var = this.c;
            ValueAnimator valueAnimator = zb1Var.U;
            if (valueAnimator != null) {
                this.b = true;
                org.telegram.messenger.g0.i3(b0Var, (valueAnimator.getDuration() - zb1Var.U.getCurrentPlayTime()) + 50);
            } else {
                b0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
