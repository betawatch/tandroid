package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class t7 extends bk0 {
    public float r;
    public float s;
    public boolean v;
    public final org.telegram.ui.Cells.u5 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ k8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(k8 k8Var, Context context, float f7) {
        super(context);
        this.y = k8Var;
        this.x = f7;
        this.w = new org.telegram.ui.Cells.u5(this, 4);
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
        k8 k8Var = this.y;
        t7 t7Var = k8Var.K;
        if (k8Var.S.w || k8Var.G0 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.u5 u5Var = this.w;
        if (action == 0) {
            this.v = false;
            this.r = rawX;
            this.s = rawY;
            AndroidUtilities.runOnUIThread(u5Var, 300L);
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
                    AndroidUtilities.cancelRunOnUIThread(u5Var);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.v && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.getInstance().playNextMessage();
            t7Var.setProgress(0.0f);
            t7Var.d();
        }
        AndroidUtilities.cancelRunOnUIThread(u5Var);
        if (k8Var.I0 > 0) {
            MediaController.getInstance().setPlaybackSpeed(true, 1.0f);
            if (MediaController.getInstance().isMessagePaused()) {
                k8Var.K0 = 0L;
                k8Var.N0.run();
            }
        }
        k8Var.G0 = 0;
        setPressed(false);
        k8Var.I0 = 0;
        k8Var.H0 = -1.0f;
        return true;
    }
}
