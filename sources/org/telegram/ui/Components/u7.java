package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u7 extends fk0 {
    public float r;
    public float s;
    public boolean v;
    public final org.telegram.ui.Cells.t6 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ l8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(l8 l8Var, Context context, float f7) {
        super(context);
        this.y = l8Var;
        this.x = f7;
        this.w = new org.telegram.ui.Cells.t6(this, 3);
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
        l8 l8Var = this.y;
        u7 u7Var = l8Var.L;
        if (l8Var.T.v || l8Var.H0 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.t6 t6Var = this.w;
        if (action == 0) {
            this.v = false;
            this.r = rawX;
            this.s = rawY;
            AndroidUtilities.runOnUIThread(t6Var, 300L);
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
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.v && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.getInstance().playNextMessage();
            u7Var.setProgress(0.0f);
            u7Var.d();
        }
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        if (l8Var.J0 > 0) {
            MediaController.getInstance().setPlaybackSpeed(true, 1.0f);
            if (MediaController.getInstance().isMessagePaused()) {
                l8Var.L0 = 0L;
                l8Var.N0.run();
            }
        }
        l8Var.H0 = 0;
        setPressed(false);
        l8Var.J0 = 0;
        l8Var.I0 = -1.0f;
        return true;
    }
}
