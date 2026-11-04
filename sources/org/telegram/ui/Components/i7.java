package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i7 extends fh0 {
    public final h7 E;
    public final h7 F;
    public long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ z7 I;
    public float r;
    public float s;
    public int w;
    public long x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(z7 z7Var, Context context, float f10) {
        super(context);
        this.I = z7Var;
        this.H = f10;
        this.w = 0;
        this.E = new h7(this, 0);
        this.F = new h7(this, 1);
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
        z7 z7Var = this.I;
        i7 i7Var = z7Var.B1;
        if (z7Var.K1.x || z7Var.y2 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        h7 h7Var = this.E;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.G = System.currentTimeMillis();
            z7Var.y2 = 0;
            org.telegram.messenger.g0.i3(h7Var, 300L);
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
                if (f12 > f13 * f13 && z7Var.y2 == 0) {
                    org.telegram.messenger.g0.r(h7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        org.telegram.messenger.g0.r(h7Var);
        h7 h7Var2 = this.F;
        org.telegram.messenger.g0.r(h7Var2);
        if (z7Var.y2 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.G < 300) {
            MediaController.B().V();
            i7Var.setProgress(0.0f);
            i7Var.d();
        }
        if (this.w > 0) {
            this.y = 0L;
            h7Var2.run();
            MediaController.B().c0();
        }
        z7Var.z2 = -1.0f;
        setPressed(false);
        z7Var.y2 = 0;
        this.w = 0;
        return true;
    }
}
