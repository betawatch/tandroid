package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j7 extends ch0 {
    public final i7 D;
    public final i7 E;
    public long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ a8 H;
    public float r;
    public float s;
    public int w;
    public long x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(a8 a8Var, Context context, float f10) {
        super(context);
        this.H = a8Var;
        this.G = f10;
        this.w = 0;
        this.D = new i7(this, 0);
        this.E = new i7(this, 1);
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
        a8 a8Var = this.H;
        j7 j7Var = a8Var.D1;
        if (a8Var.M1.x || a8Var.A2 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        i7 i7Var = this.D;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.F = System.currentTimeMillis();
            a8Var.A2 = 0;
            org.telegram.messenger.g0.i3(i7Var, 300L);
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
                if (f12 > f13 * f13 && a8Var.A2 == 0) {
                    org.telegram.messenger.g0.r(i7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        org.telegram.messenger.g0.r(i7Var);
        i7 i7Var2 = this.E;
        org.telegram.messenger.g0.r(i7Var2);
        if (a8Var.A2 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.F < 300) {
            MediaController.B().V();
            j7Var.setProgress(0.0f);
            j7Var.d();
        }
        if (this.w > 0) {
            this.y = 0L;
            i7Var2.run();
            MediaController.B().c0();
        }
        a8Var.B2 = -1.0f;
        setPressed(false);
        a8Var.A2 = 0;
        this.w = 0;
        return true;
    }
}
