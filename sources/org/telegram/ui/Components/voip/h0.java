package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.ui.ud1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h0 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ud1 c;

    public h0(ud1 ud1Var) {
        this.c = ud1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a = true;
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > org.telegram.messenger.i0.a1(true, 0.4f) && Math.abs(x10) / 3.0f > y3 && this.a && !this.b) {
            this.a = false;
            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(this, x10, 2);
            ud1 ud1Var = this.c;
            ValueAnimator valueAnimator = ud1Var.U;
            if (valueAnimator != null) {
                this.b = true;
                org.telegram.messenger.i0.h3(a0Var, (valueAnimator.getDuration() - ud1Var.U.getCurrentPlayTime()) + 50);
            } else {
                a0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
