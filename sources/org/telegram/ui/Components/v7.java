package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v7 extends bk0 {
    public float r;
    public float s;
    public boolean v;
    public final m.g3 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ m8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(m8 m8Var, Context context, float f7) {
        super(context);
        this.y = m8Var;
        this.x = f7;
        this.w = new m.g3(this, 8);
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
        v7 v7Var = m8Var.K;
        if (m8Var.S.w || m8Var.G0 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        m.g3 g3Var = this.w;
        if (action == 0) {
            this.v = false;
            this.r = rawX;
            this.s = rawY;
            AndroidUtilities.runOnUIThread(g3Var, 300L);
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
                    AndroidUtilities.cancelRunOnUIThread(g3Var);
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
        AndroidUtilities.cancelRunOnUIThread(g3Var);
        if (m8Var.I0 > 0) {
            MediaController.getInstance().setPlaybackSpeed(true, 1.0f);
            if (MediaController.getInstance().isMessagePaused()) {
                m8Var.K0 = 0L;
                m8Var.N0.run();
            }
        }
        m8Var.G0 = 0;
        setPressed(false);
        m8Var.I0 = 0;
        m8Var.H0 = -1.0f;
        return true;
    }
}
