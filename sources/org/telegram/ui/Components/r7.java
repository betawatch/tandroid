package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class r7 extends nj0 {
    public float r;
    public float s;
    public boolean v;
    public final org.telegram.ui.Cells.u6 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ i8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(i8 i8Var, Context context, float f7) {
        super(context);
        this.y = i8Var;
        this.x = f7;
        this.w = new org.telegram.ui.Cells.u6(this, 4);
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
        i8 i8Var = this.y;
        r7 r7Var = i8Var.L;
        if (i8Var.T.v || i8Var.H0 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.u6 u6Var = this.w;
        if (action == 0) {
            this.v = false;
            this.r = rawX;
            this.s = rawY;
            AndroidUtilities.runOnUIThread(u6Var, 300L);
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
                    AndroidUtilities.cancelRunOnUIThread(u6Var);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.v && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.getInstance().playNextMessage();
            r7Var.setProgress(0.0f);
            r7Var.d();
        }
        AndroidUtilities.cancelRunOnUIThread(u6Var);
        if (i8Var.J0 > 0) {
            MediaController.getInstance().setPlaybackSpeed(true, 1.0f);
            if (MediaController.getInstance().isMessagePaused()) {
                i8Var.L0 = 0L;
                i8Var.N0.run();
            }
        }
        i8Var.H0 = 0;
        setPressed(false);
        i8Var.J0 = 0;
        i8Var.I0 = -1.0f;
        return true;
    }
}
