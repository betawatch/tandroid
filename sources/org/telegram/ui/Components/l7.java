package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l7 extends pi0 {
    public float r;
    public float s;
    public boolean v;
    public final m.i3 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ c8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(c8 c8Var, Context context, float f10) {
        super(context);
        this.y = c8Var;
        this.x = f10;
        this.w = new m.i3(this, 10);
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
        c8 c8Var = this.y;
        l7 l7Var = c8Var.H;
        if (c8Var.P.v || c8Var.D0 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        m.i3 i3Var = this.w;
        if (action == 0) {
            this.v = false;
            this.r = rawX;
            this.s = rawY;
            AndroidUtilities.runOnUIThread(i3Var, 300L);
            if (getBackground() != null) {
                getBackground().setHotspot(this.r, this.s);
            }
            setPressed(true);
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f10 = rawX - this.r;
                float f11 = rawY - this.s;
                float f12 = (f11 * f11) + (f10 * f10);
                float f13 = this.x;
                if (f12 > f13 * f13 && !this.v) {
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.v && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.getInstance().playNextMessage();
            l7Var.setProgress(0.0f);
            l7Var.d();
        }
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        if (c8Var.F0 > 0) {
            MediaController.getInstance().setPlaybackSpeed(true, 1.0f);
            if (MediaController.getInstance().isMessagePaused()) {
                c8Var.H0 = 0L;
                c8Var.J0.run();
            }
        }
        c8Var.D0 = 0;
        setPressed(false);
        c8Var.F0 = 0;
        c8Var.E0 = -1.0f;
        return true;
    }
}
