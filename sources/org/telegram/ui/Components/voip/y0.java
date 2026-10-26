package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ih1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class y0 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ih1 c;

    public y0(ih1 ih1Var) {
        this.c = ih1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a = true;
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x9 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x9) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x9) / 3.0f > y3 && this.a && !this.b) {
            this.a = false;
            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, x9, 3);
            ih1 ih1Var = this.c;
            ValueAnimator valueAnimator = ih1Var.U;
            if (valueAnimator != null) {
                this.b = true;
                AndroidUtilities.runOnUIThread(b0Var, (valueAnimator.getDuration() - ih1Var.U.getCurrentPlayTime()) + 50);
            } else {
                b0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
