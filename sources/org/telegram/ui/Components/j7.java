package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j7 extends fh0 {
    public final /* synthetic */ z7 E;
    public float r;
    public float s;
    public boolean w;
    public final mi.b0 x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(z7 z7Var, Context context, float f10) {
        super(context);
        this.E = z7Var;
        this.y = f10;
        this.x = new mi.b0(this, 23);
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
        z7 z7Var = this.E;
        j7 j7Var = z7Var.C1;
        if (z7Var.K1.x || z7Var.y2 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        mi.b0 b0Var = this.x;
        if (action == 0) {
            this.w = false;
            this.r = rawX;
            this.s = rawY;
            org.telegram.messenger.g0.i3(b0Var, 300L);
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
                float f13 = this.y;
                if (f12 > f13 * f13 && !this.w) {
                    org.telegram.messenger.g0.r(b0Var);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.w && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.B().U(false);
            j7Var.setProgress(0.0f);
            j7Var.d();
        }
        org.telegram.messenger.g0.r(b0Var);
        if (z7Var.A2 > 0) {
            MediaController.B().m0(true, 1.0f);
            if (MediaController.B().H()) {
                z7Var.C2 = 0L;
                z7Var.F2.run();
            }
        }
        z7Var.y2 = 0;
        setPressed(false);
        z7Var.A2 = 0;
        z7Var.z2 = -1.0f;
        return true;
    }
}
