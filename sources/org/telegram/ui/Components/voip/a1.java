package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.fi1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class a1 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public boolean b;
    public final /* synthetic */ fi1 c;

    public a1(fi1 fi1Var) {
        this.c = fi1Var;
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
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.a && !this.b) {
            this.a = false;
            org.telegram.ui.c0 c0Var = new org.telegram.ui.c0(this, x10, 2);
            fi1 fi1Var = this.c;
            ValueAnimator valueAnimator = fi1Var.U;
            if (valueAnimator != null) {
                this.b = true;
                AndroidUtilities.runOnUIThread(c0Var, (valueAnimator.getDuration() - fi1Var.U.getCurrentPlayTime()) + 50);
            } else {
                c0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
