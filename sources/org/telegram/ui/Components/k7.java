package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class k7 extends ch0 {
    public final j7 D;
    public final j7 E;
    public long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ b8 H;
    public float r;
    public float s;
    public int w;
    public long x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(b8 b8Var, Context context, float f10) {
        super(context);
        this.H = b8Var;
        this.G = f10;
        this.w = 0;
        this.D = new j7(this, 0);
        this.E = new j7(this, 1);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r6 != 3) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b8 b8Var = this.H;
        k7 k7Var = b8Var.A1;
        if (b8Var.J1.x || b8Var.x2 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        j7 j7Var = this.D;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.F = System.currentTimeMillis();
            b8Var.x2 = 0;
            org.telegram.messenger.g0.i3(j7Var, 300L);
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
                float f13 = this.G;
                if (f12 > f13 * f13 && b8Var.x2 == 0) {
                    org.telegram.messenger.g0.r(j7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        org.telegram.messenger.g0.r(j7Var);
        j7 j7Var2 = this.E;
        org.telegram.messenger.g0.r(j7Var2);
        if (b8Var.x2 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.F < 300) {
            MediaController.B().V();
            k7Var.setProgress(0.0f);
            k7Var.d();
        }
        if (this.w > 0) {
            this.y = 0L;
            j7Var2.run();
            MediaController.B().c0();
        }
        b8Var.y2 = -1.0f;
        setPressed(false);
        b8Var.x2 = 0;
        this.w = 0;
        return true;
    }
}
