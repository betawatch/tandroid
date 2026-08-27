package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.eh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x0 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public boolean b;
    public final /* synthetic */ eh1 c;

    public x0(eh1 eh1Var) {
        this.c = eh1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a = true;
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x8 = motionEvent.getX() - motionEvent2.getX();
        float y10 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x8) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x8) / 3.0f > y10 && this.a && !this.b) {
            this.a = false;
            org.telegram.ui.e0 e0Var = new org.telegram.ui.e0(this, x8, 2);
            eh1 eh1Var = this.c;
            ValueAnimator valueAnimator = eh1Var.Q;
            if (valueAnimator != null) {
                this.b = true;
                AndroidUtilities.runOnUIThread(e0Var, (valueAnimator.getDuration() - eh1Var.Q.getCurrentPlayTime()) + 50);
            } else {
                e0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
