package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h7 extends ei0 {
    public final /* synthetic */ w7 D;
    public float r;
    public float s;
    public boolean w;
    public final mg.c2 x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(w7 w7Var, Context context, float f7) {
        super(context);
        this.D = w7Var;
        this.y = f7;
        this.x = new mg.c2(this, 22);
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
        w7 w7Var = this.D;
        h7 h7Var = w7Var.B1;
        if (w7Var.J1.x || w7Var.x2 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        mg.c2 c2Var = this.x;
        if (action == 0) {
            this.w = false;
            this.r = rawX;
            this.s = rawY;
            org.telegram.messenger.i0.h3(c2Var, 300L);
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
                float f12 = this.y;
                if (f11 > f12 * f12 && !this.w) {
                    org.telegram.messenger.i0.r(c2Var);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.w && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.B().U(false);
            h7Var.setProgress(0.0f);
            h7Var.d();
        }
        org.telegram.messenger.i0.r(c2Var);
        if (w7Var.z2 > 0) {
            MediaController.B().m0(true, 1.0f);
            if (MediaController.B().H()) {
                w7Var.B2 = 0L;
                w7Var.E2.run();
            }
        }
        w7Var.x2 = 0;
        setPressed(false);
        w7Var.z2 = 0;
        w7Var.y2 = -1.0f;
        return true;
    }
}
