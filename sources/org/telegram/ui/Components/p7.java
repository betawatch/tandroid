package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p7 extends aj0 {
    public final o7 A;
    public long B;
    public final /* synthetic */ float C;
    public final /* synthetic */ g8 D;
    public float r;
    public float s;
    public int v;
    public long w;
    public long x;
    public final o7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(g8 g8Var, Context context, float f9) {
        super(context);
        this.D = g8Var;
        this.C = f9;
        this.v = 0;
        this.y = new o7(this, 0);
        this.A = new o7(this, 1);
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
        g8 g8Var = this.D;
        p7 p7Var = g8Var.G;
        if (g8Var.P.v || g8Var.D0 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        o7 o7Var = this.y;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.B = System.currentTimeMillis();
            g8Var.D0 = 0;
            AndroidUtilities.runOnUIThread(o7Var, 300L);
            if (getBackground() != null) {
                getBackground().setHotspot(this.r, this.s);
            }
            setPressed(true);
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f9 = rawX - this.r;
                float f10 = rawY - this.s;
                float f11 = (f10 * f10) + (f9 * f9);
                float f12 = this.C;
                if (f11 > f12 * f12 && g8Var.D0 == 0) {
                    AndroidUtilities.cancelRunOnUIThread(o7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(o7Var);
        o7 o7Var2 = this.A;
        AndroidUtilities.cancelRunOnUIThread(o7Var2);
        if (g8Var.D0 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.B < 300) {
            MediaController.getInstance().playPreviousMessage();
            p7Var.setProgress(0.0f);
            p7Var.d();
        }
        if (this.v > 0) {
            this.x = 0L;
            o7Var2.run();
            MediaController.getInstance().resumeByRewind();
        }
        g8Var.E0 = -1.0f;
        setPressed(false);
        g8Var.D0 = 0;
        this.v = 0;
        return true;
    }
}
