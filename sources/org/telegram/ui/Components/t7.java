package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class t7 extends fk0 {
    public final s7 E;
    public long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ l8 H;
    public float r;
    public float s;
    public int v;
    public long w;
    public long x;
    public final s7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(l8 l8Var, Context context, float f7) {
        super(context);
        this.H = l8Var;
        this.G = f7;
        this.v = 0;
        this.y = new s7(this, 0);
        this.E = new s7(this, 1);
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
        l8 l8Var = this.H;
        t7 t7Var = l8Var.K;
        if (l8Var.T.v || l8Var.H0 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        s7 s7Var = this.y;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.F = System.currentTimeMillis();
            l8Var.H0 = 0;
            AndroidUtilities.runOnUIThread(s7Var, 300L);
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
                if (f11 > f12 * f12 && l8Var.H0 == 0) {
                    AndroidUtilities.cancelRunOnUIThread(s7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(s7Var);
        s7 s7Var2 = this.E;
        AndroidUtilities.cancelRunOnUIThread(s7Var2);
        if (l8Var.H0 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.F < 300) {
            MediaController.getInstance().playPreviousMessage();
            t7Var.setProgress(0.0f);
            t7Var.d();
        }
        if (this.v > 0) {
            this.x = 0L;
            s7Var2.run();
            MediaController.getInstance().resumeByRewind();
        }
        l8Var.I0 = -1.0f;
        setPressed(false);
        l8Var.H0 = 0;
        this.v = 0;
        return true;
    }
}
