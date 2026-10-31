package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g7 extends ei0 {
    public final f7 D;
    public final f7 E;
    public long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ w7 H;
    public float r;
    public float s;
    public int w;
    public long x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(w7 w7Var, Context context, float f7) {
        super(context);
        this.H = w7Var;
        this.G = f7;
        this.w = 0;
        this.D = new f7(this, 0);
        this.E = new f7(this, 1);
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
        w7 w7Var = this.H;
        g7 g7Var = w7Var.A1;
        if (w7Var.J1.x || w7Var.x2 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        f7 f7Var = this.D;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.F = System.currentTimeMillis();
            w7Var.x2 = 0;
            org.telegram.messenger.i0.h3(f7Var, 300L);
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
                float f12 = this.G;
                if (f11 > f12 * f12 && w7Var.x2 == 0) {
                    org.telegram.messenger.i0.r(f7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        org.telegram.messenger.i0.r(f7Var);
        f7 f7Var2 = this.E;
        org.telegram.messenger.i0.r(f7Var2);
        if (w7Var.x2 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.F < 300) {
            MediaController.B().V();
            g7Var.setProgress(0.0f);
            g7Var.d();
        }
        if (this.w > 0) {
            this.y = 0L;
            f7Var2.run();
            MediaController.B().c0();
        }
        w7Var.y2 = -1.0f;
        setPressed(false);
        w7Var.x2 = 0;
        this.w = 0;
        return true;
    }
}
