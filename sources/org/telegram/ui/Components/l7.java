package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l7 extends ch0 {
    public final /* synthetic */ b8 D;
    public float r;
    public float s;
    public boolean w;
    public final m.f3 x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(b8 b8Var, Context context, float f10) {
        super(context);
        this.D = b8Var;
        this.y = f10;
        this.x = new m.f3(this, 24);
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
        b8 b8Var = this.D;
        l7 l7Var = b8Var.B1;
        if (b8Var.J1.x || b8Var.x2 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        m.f3 f3Var = this.x;
        if (action == 0) {
            this.w = false;
            this.r = rawX;
            this.s = rawY;
            org.telegram.messenger.g0.i3(f3Var, 300L);
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
                    org.telegram.messenger.g0.r(f3Var);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.w && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.B().U(false);
            l7Var.setProgress(0.0f);
            l7Var.d();
        }
        org.telegram.messenger.g0.r(f3Var);
        if (b8Var.z2 > 0) {
            MediaController.B().m0(true, 1.0f);
            if (MediaController.B().H()) {
                b8Var.B2 = 0L;
                b8Var.E2.run();
            }
        }
        b8Var.x2 = 0;
        setPressed(false);
        b8Var.z2 = 0;
        b8Var.y2 = -1.0f;
        return true;
    }
}
