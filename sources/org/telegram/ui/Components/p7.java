package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p7 extends bj0 {
    public final o7 E;
    public long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ h8 H;
    public float r;
    public float s;
    public int v;
    public long w;
    public long x;
    public final o7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(h8 h8Var, Context context, float f7) {
        super(context);
        this.H = h8Var;
        this.G = f7;
        this.v = 0;
        this.y = new o7(this, 0);
        this.E = new o7(this, 1);
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
        h8 h8Var = this.H;
        p7 p7Var = h8Var.K;
        if (h8Var.T.v || h8Var.H0 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        o7 o7Var = this.y;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.F = System.currentTimeMillis();
            h8Var.H0 = 0;
            AndroidUtilities.runOnUIThread(o7Var, 300L);
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
                if (f11 > f12 * f12 && h8Var.H0 == 0) {
                    AndroidUtilities.cancelRunOnUIThread(o7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(o7Var);
        o7 o7Var2 = this.E;
        AndroidUtilities.cancelRunOnUIThread(o7Var2);
        if (h8Var.H0 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.F < 300) {
            MediaController.getInstance().playPreviousMessage();
            p7Var.setProgress(0.0f);
            p7Var.d();
        }
        if (this.v > 0) {
            this.x = 0L;
            o7Var2.run();
            MediaController.getInstance().resumeByRewind();
        }
        h8Var.I0 = -1.0f;
        setPressed(false);
        h8Var.H0 = 0;
        this.v = 0;
        return true;
    }
}
