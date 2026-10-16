package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class v7 extends bk0 {
    public float r;
    public float s;
    public boolean v;
    public final org.telegram.ui.Cells.l7 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ m8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(m8 m8Var, Context context, float f7) {
        super(context);
        this.y = m8Var;
        this.x = f7;
        this.w = new org.telegram.ui.Cells.l7(this, 2);
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
        m8 m8Var = this.y;
        v7 v7Var = m8Var.L;
        if (m8Var.T.v || m8Var.H0 == -1) {
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
            v7Var.setProgress(0.0f);
            v7Var.d();
        }
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        if (m8Var.J0 > 0) {
            MediaController.getInstance().setPlaybackSpeed(true, 1.0f);
            if (MediaController.getInstance().isMessagePaused()) {
                m8Var.L0 = 0L;
                m8Var.N0.run();
            }
        }
        m8Var.H0 = 0;
        setPressed(false);
        m8Var.J0 = 0;
        m8Var.I0 = -1.0f;
        return true;
    }
}
