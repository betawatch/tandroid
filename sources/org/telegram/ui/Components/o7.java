package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o7 extends ph0 {
    public final n7 E;
    public final n7 F;
    public long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ g8 I;
    public float r;
    public float s;
    public int w;
    public long x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(g8 g8Var, Context context, float f10) {
        super(context);
        this.I = g8Var;
        this.H = f10;
        this.w = 0;
        this.E = new n7(this, 0);
        this.F = new n7(this, 1);
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
        g8 g8Var = this.I;
        o7 o7Var = g8Var.E1;
        if (g8Var.N1.x || g8Var.B2 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        n7 n7Var = this.E;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.G = System.currentTimeMillis();
            g8Var.B2 = 0;
            org.telegram.messenger.g0.h3(n7Var, 300L);
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
                if (f12 > f13 * f13 && g8Var.B2 == 0) {
                    org.telegram.messenger.g0.r(n7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        org.telegram.messenger.g0.r(n7Var);
        n7 n7Var2 = this.F;
        org.telegram.messenger.g0.r(n7Var2);
        if (g8Var.B2 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.G < 300) {
            MediaController.B().V();
            o7Var.setProgress(0.0f);
            o7Var.d();
        }
        if (this.w > 0) {
            this.y = 0L;
            n7Var2.run();
            MediaController.B().c0();
        }
        g8Var.C2 = -1.0f;
        setPressed(false);
        g8Var.B2 = 0;
        this.w = 0;
        return true;
    }
}
