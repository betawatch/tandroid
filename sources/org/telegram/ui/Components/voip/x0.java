package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.fh1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x0 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public boolean b;
    public final /* synthetic */ fh1 c;

    public x0(fh1 fh1Var) {
        this.c = fh1Var;
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
            fh1 fh1Var = this.c;
            ValueAnimator valueAnimator = fh1Var.Q;
            if (valueAnimator != null) {
                this.b = true;
                AndroidUtilities.runOnUIThread(d0Var, (valueAnimator.getDuration() - fh1Var.Q.getCurrentPlayTime()) + 50);
            } else {
                d0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
