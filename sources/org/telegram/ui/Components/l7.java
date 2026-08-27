package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l7 extends ri0 {
    public float r;
    public float s;
    public boolean v;
    public final m.i3 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ b8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(b8 b8Var, Context context, float f10) {
        super(context);
        this.y = b8Var;
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
        b8 b8Var = this.y;
        l7 l7Var = b8Var.H;
        if (b8Var.P.v || b8Var.D0 == -1) {
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
        if (b8Var.F0 > 0) {
            MediaController.getInstance().setPlaybackSpeed(true, 1.0f);
            if (MediaController.getInstance().isMessagePaused()) {
                b8Var.H0 = 0L;
                b8Var.J0.run();
            }
        }
        b8Var.D0 = 0;
        setPressed(false);
        b8Var.F0 = 0;
        b8Var.E0 = -1.0f;
        return true;
    }
}
