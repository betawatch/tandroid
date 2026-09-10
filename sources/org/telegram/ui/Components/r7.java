package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class r7 extends kj0 {
    public final q7 E;
    public long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ j8 H;
    public float r;
    public float s;
    public int v;
    public long w;
    public long x;
    public final q7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(j8 j8Var, Context context, float f7) {
        super(context);
        this.H = j8Var;
        this.G = f7;
        this.v = 0;
        this.y = new q7(this, 0);
        this.E = new q7(this, 1);
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
        j8 j8Var = this.H;
        r7 r7Var = j8Var.K;
        if (j8Var.T.v || j8Var.H0 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        q7 q7Var = this.y;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.F = System.currentTimeMillis();
            j8Var.H0 = 0;
            AndroidUtilities.runOnUIThread(q7Var, 300L);
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
                if (f11 > f12 * f12 && j8Var.H0 == 0) {
                    AndroidUtilities.cancelRunOnUIThread(q7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(q7Var);
        q7 q7Var2 = this.E;
        AndroidUtilities.cancelRunOnUIThread(q7Var2);
        if (j8Var.H0 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.F < 300) {
            MediaController.getInstance().playPreviousMessage();
            r7Var.setProgress(0.0f);
            r7Var.d();
        }
        if (this.v > 0) {
            this.x = 0L;
            q7Var2.run();
            MediaController.getInstance().resumeByRewind();
        }
        j8Var.I0 = -1.0f;
        setPressed(false);
        j8Var.H0 = 0;
        this.v = 0;
        return true;
    }
}
