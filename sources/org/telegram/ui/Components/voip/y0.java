package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bi1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class y0 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public boolean b;
    public final /* synthetic */ bi1 c;

    public y0(bi1 bi1Var) {
        this.c = bi1Var;
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
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y10 && this.a && !this.b) {
            this.a = false;
            org.telegram.ui.d0 d0Var = new org.telegram.ui.d0(this, x10, 2);
            bi1 bi1Var = this.c;
            ValueAnimator valueAnimator = bi1Var.R;
            if (valueAnimator != null) {
                this.b = true;
                AndroidUtilities.runOnUIThread(d0Var, (valueAnimator.getDuration() - bi1Var.R.getCurrentPlayTime()) + 50);
            } else {
                d0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
