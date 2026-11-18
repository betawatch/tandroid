package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class p7 extends ph0 {
    public final /* synthetic */ g8 E;
    public float r;
    public float s;
    public boolean w;
    public final j6.o x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(g8 g8Var, Context context, float f10) {
        super(context);
        this.E = g8Var;
        this.y = f10;
        this.x = new j6.o(this, 27);
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
        g8 g8Var = this.E;
        p7 p7Var = g8Var.F1;
        if (g8Var.N1.x || g8Var.B2 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        j6.o oVar = this.x;
        if (action == 0) {
            this.w = false;
            this.r = rawX;
            this.s = rawY;
            org.telegram.messenger.g0.h3(oVar, 300L);
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
                    org.telegram.messenger.g0.r(oVar);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.w && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.B().U(false);
            p7Var.setProgress(0.0f);
            p7Var.d();
        }
        org.telegram.messenger.g0.r(oVar);
        if (g8Var.D2 > 0) {
            MediaController.B().m0(true, 1.0f);
            if (MediaController.B().H()) {
                g8Var.F2 = 0L;
                g8Var.I2.run();
            }
        }
        g8Var.B2 = 0;
        setPressed(false);
        g8Var.D2 = 0;
        g8Var.C2 = -1.0f;
        return true;
    }
}
