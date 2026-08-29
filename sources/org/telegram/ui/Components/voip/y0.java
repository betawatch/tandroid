package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.hh1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class y0 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public boolean b;
    public final /* synthetic */ hh1 c;

    public y0(hh1 hh1Var) {
        this.c = hh1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a = true;
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        float x4 = motionEvent.getX() - motionEvent2.getX();
        float y8 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x4) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x4) / 3.0f > y8 && this.a && !this.b) {
            this.a = false;
            org.telegram.ui.e0 e0Var = new org.telegram.ui.e0(this, x4, 2);
            hh1 hh1Var = this.c;
            ValueAnimator valueAnimator = hh1Var.Q;
            if (valueAnimator != null) {
                this.b = true;
                AndroidUtilities.runOnUIThread(e0Var, (valueAnimator.getDuration() - hh1Var.Q.getCurrentPlayTime()) + 50);
            } else {
                e0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f9, f10);
    }
}
