package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q7 extends aj0 {
    public float r;
    public float s;
    public boolean v;
    public final lh.m7 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ g8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(g8 g8Var, Context context, float f9) {
        super(context);
        this.y = g8Var;
        this.x = f9;
        this.w = new lh.m7(this, 13);
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
        g8 g8Var = this.y;
        q7 q7Var = g8Var.H;
        if (g8Var.P.v || g8Var.D0 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        lh.m7 m7Var = this.w;
        if (action == 0) {
            this.v = false;
            this.r = rawX;
            this.s = rawY;
            AndroidUtilities.runOnUIThread(m7Var, 300L);
            if (getBackground() != null) {
                getBackground().setHotspot(this.r, this.s);
            }
            setPressed(true);
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f9 = rawX - this.r;
                float f10 = rawY - this.s;
                float f11 = (f10 * f10) + (f9 * f9);
                float f12 = this.x;
                if (f11 > f12 * f12 && !this.v) {
                    AndroidUtilities.cancelRunOnUIThread(m7Var);
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
        AndroidUtilities.cancelRunOnUIThread(m7Var);
        if (g8Var.F0 > 0) {
            MediaController.getInstance().setPlaybackSpeed(true, 1.0f);
            if (MediaController.getInstance().isMessagePaused()) {
                g8Var.H0 = 0L;
                g8Var.J0.run();
            }
        }
        g8Var.D0 = 0;
        setPressed(false);
        g8Var.F0 = 0;
        g8Var.E0 = -1.0f;
        return true;
    }
}
