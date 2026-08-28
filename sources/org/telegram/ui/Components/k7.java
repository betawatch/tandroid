package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k7 extends pi0 {
    public final j7 A;
    public long B;
    public final /* synthetic */ float C;
    public final /* synthetic */ c8 D;
    public float r;
    public float s;
    public int v;
    public long w;
    public long x;
    public final j7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(c8 c8Var, Context context, float f10) {
        super(context);
        this.D = c8Var;
        this.C = f10;
        this.v = 0;
        this.y = new j7(this, 0);
        this.A = new j7(this, 1);
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
        c8 c8Var = this.D;
        k7 k7Var = c8Var.G;
        if (c8Var.P.v || c8Var.D0 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        j7 j7Var = this.y;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.B = System.currentTimeMillis();
            c8Var.D0 = 0;
            AndroidUtilities.runOnUIThread(j7Var, 300L);
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
                float f13 = this.C;
                if (f12 > f13 * f13 && c8Var.D0 == 0) {
                    AndroidUtilities.cancelRunOnUIThread(j7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(j7Var);
        j7 j7Var2 = this.A;
        AndroidUtilities.cancelRunOnUIThread(j7Var2);
        if (c8Var.D0 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.B < 300) {
            MediaController.getInstance().playPreviousMessage();
            k7Var.setProgress(0.0f);
            k7Var.d();
        }
        if (this.v > 0) {
            this.x = 0L;
            j7Var2.run();
            MediaController.getInstance().resumeByRewind();
        }
        c8Var.E0 = -1.0f;
        setPressed(false);
        c8Var.D0 = 0;
        this.v = 0;
        return true;
    }
}
