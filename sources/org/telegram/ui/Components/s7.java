package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s7 extends kj0 {
    public float r;
    public float s;
    public boolean v;
    public final org.telegram.ui.Cells.l9 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ j8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(j8 j8Var, Context context, float f7) {
        super(context);
        this.y = j8Var;
        this.x = f7;
        this.w = new org.telegram.ui.Cells.l9(this, 1);
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
        j8 j8Var = this.y;
        s7 s7Var = j8Var.L;
        if (j8Var.T.v || j8Var.H0 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.l9 l9Var = this.w;
        if (action == 0) {
            this.v = false;
            this.r = rawX;
            this.s = rawY;
            AndroidUtilities.runOnUIThread(l9Var, 300L);
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
                    AndroidUtilities.cancelRunOnUIThread(l9Var);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.v && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.getInstance().playNextMessage();
            s7Var.setProgress(0.0f);
            s7Var.d();
        }
        AndroidUtilities.cancelRunOnUIThread(l9Var);
        if (j8Var.J0 > 0) {
            MediaController.getInstance().setPlaybackSpeed(true, 1.0f);
            if (MediaController.getInstance().isMessagePaused()) {
                j8Var.L0 = 0L;
                j8Var.N0.run();
            }
        }
        j8Var.H0 = 0;
        setPressed(false);
        j8Var.J0 = 0;
        j8Var.I0 = -1.0f;
        return true;
    }
}
