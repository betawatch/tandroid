package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h7 extends fh0 {
    public final g7 E;
    public final g7 F;
    public long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ y7 I;
    public float r;
    public float s;
    public int w;
    public long x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(y7 y7Var, Context context, float f10) {
        super(context);
        this.I = y7Var;
        this.H = f10;
        this.w = 0;
        this.E = new g7(this, 0);
        this.F = new g7(this, 1);
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
        y7 y7Var = this.I;
        h7 h7Var = y7Var.E1;
        if (y7Var.N1.x || y7Var.B2 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        g7 g7Var = this.E;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.G = System.currentTimeMillis();
            y7Var.B2 = 0;
            org.telegram.messenger.g0.i3(g7Var, 300L);
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
                float f13 = this.H;
                if (f12 > f13 * f13 && y7Var.B2 == 0) {
                    org.telegram.messenger.g0.r(g7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        org.telegram.messenger.g0.r(g7Var);
        g7 g7Var2 = this.F;
        org.telegram.messenger.g0.r(g7Var2);
        if (y7Var.B2 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.G < 300) {
            MediaController.B().V();
            h7Var.setProgress(0.0f);
            h7Var.d();
        }
        if (this.w > 0) {
            this.y = 0L;
            g7Var2.run();
            MediaController.B().c0();
        }
        y7Var.C2 = -1.0f;
        setPressed(false);
        y7Var.B2 = 0;
        this.w = 0;
        return true;
    }
}
