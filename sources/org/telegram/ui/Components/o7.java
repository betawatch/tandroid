package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class o7 extends qh0 {
    public final /* synthetic */ e8 E;
    public float r;
    public float s;
    public boolean w;
    public final i6.g x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(e8 e8Var, Context context, float f10) {
        super(context);
        this.E = e8Var;
        this.y = f10;
        this.x = new i6.g(this, 28);
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
        e8 e8Var = this.E;
        o7 o7Var = e8Var.F1;
        if (e8Var.N1.x || e8Var.B2 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        i6.g gVar = this.x;
        if (action == 0) {
            this.w = false;
            this.r = rawX;
            this.s = rawY;
            org.telegram.messenger.g0.h3(gVar, 300L);
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
                    org.telegram.messenger.g0.r(gVar);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.w && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.B().U(false);
            o7Var.setProgress(0.0f);
            o7Var.d();
        }
        org.telegram.messenger.g0.r(gVar);
        if (e8Var.D2 > 0) {
            MediaController.B().m0(true, 1.0f);
            if (MediaController.B().H()) {
                e8Var.F2 = 0L;
                e8Var.I2.run();
            }
        }
        e8Var.B2 = 0;
        setPressed(false);
        e8Var.D2 = 0;
        e8Var.C2 = -1.0f;
        return true;
    }
}
