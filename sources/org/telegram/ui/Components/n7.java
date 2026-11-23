package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n7 extends qh0 {
    public final m7 E;
    public final m7 F;
    public long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ e8 I;
    public float r;
    public float s;
    public int w;
    public long x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(e8 e8Var, Context context, float f10) {
        super(context);
        this.I = e8Var;
        this.H = f10;
        this.w = 0;
        this.E = new m7(this, 0);
        this.F = new m7(this, 1);
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
        e8 e8Var = this.I;
        n7 n7Var = e8Var.E1;
        if (e8Var.N1.x || e8Var.B2 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        m7 m7Var = this.E;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.G = System.currentTimeMillis();
            e8Var.B2 = 0;
            org.telegram.messenger.g0.h3(m7Var, 300L);
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
                if (f12 > f13 * f13 && e8Var.B2 == 0) {
                    org.telegram.messenger.g0.r(m7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        org.telegram.messenger.g0.r(m7Var);
        m7 m7Var2 = this.F;
        org.telegram.messenger.g0.r(m7Var2);
        if (e8Var.B2 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.G < 300) {
            MediaController.B().V();
            n7Var.setProgress(0.0f);
            n7Var.d();
        }
        if (this.w > 0) {
            this.y = 0L;
            m7Var2.run();
            MediaController.B().c0();
        }
        e8Var.C2 = -1.0f;
        setPressed(false);
        e8Var.B2 = 0;
        this.w = 0;
        return true;
    }
}
