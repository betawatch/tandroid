package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class q7 extends bj0 {
    public float r;
    public float s;
    public boolean v;
    public final org.telegram.ui.Cells.l7 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ h8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(h8 h8Var, Context context, float f7) {
        super(context);
        this.y = h8Var;
        this.x = f7;
        this.w = new org.telegram.ui.Cells.l7(this, 3);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r5 != 3) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h8 h8Var = this.y;
        q7 q7Var = h8Var.L;
        if (h8Var.T.v || h8Var.H0 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.l7 l7Var = this.w;
        if (action == 0) {
            this.v = false;
            this.r = rawX;
            this.s = rawY;
            AndroidUtilities.runOnUIThread(l7Var, 300L);
            if (getBackground() != null) {
                getBackground().setHotspot(this.r, this.s);
            }
            setPressed(true);
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f7 = rawX - this.r;
                float f10 = rawY - this.s;
                float f11 = (f10 * f10) + (f7 * f7);
                float f12 = this.x;
                if (f11 > f12 * f12 && !this.v) {
                    AndroidUtilities.cancelRunOnUIThread(l7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.v && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.getInstance().playNextMessage();
            q7Var.setProgress(0.0f);
            q7Var.d();
        }
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        if (h8Var.J0 > 0) {
            MediaController.getInstance().setPlaybackSpeed(true, 1.0f);
            if (MediaController.getInstance().isMessagePaused()) {
                h8Var.L0 = 0L;
                h8Var.N0.run();
            }
        }
        h8Var.H0 = 0;
        setPressed(false);
        h8Var.J0 = 0;
        h8Var.I0 = -1.0f;
        return true;
    }
}
