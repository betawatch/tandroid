package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class s7 extends aj0 {
    public final r7 E;
    public long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ k8 H;
    public float r;
    public float s;
    public int v;
    public long w;
    public long x;
    public final r7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(k8 k8Var, Context context, float f7) {
        super(context);
        this.H = k8Var;
        this.G = f7;
        this.v = 0;
        this.y = new r7(this, 0);
        this.E = new r7(this, 1);
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
        k8 k8Var = this.H;
        s7 s7Var = k8Var.K;
        if (k8Var.T.v || k8Var.H0 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        r7 r7Var = this.y;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.F = System.currentTimeMillis();
            k8Var.H0 = 0;
            AndroidUtilities.runOnUIThread(r7Var, 300L);
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
                if (f11 > f12 * f12 && k8Var.H0 == 0) {
                    AndroidUtilities.cancelRunOnUIThread(r7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(r7Var);
        r7 r7Var2 = this.E;
        AndroidUtilities.cancelRunOnUIThread(r7Var2);
        if (k8Var.H0 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.F < 300) {
            MediaController.getInstance().playPreviousMessage();
            s7Var.setProgress(0.0f);
            s7Var.d();
        }
        if (this.v > 0) {
            this.x = 0L;
            r7Var2.run();
            MediaController.getInstance().resumeByRewind();
        }
        k8Var.I0 = -1.0f;
        setPressed(false);
        k8Var.H0 = 0;
        this.v = 0;
        return true;
    }
}
