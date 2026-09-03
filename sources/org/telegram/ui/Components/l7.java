package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l7 extends jj0 {
    public final k7 B;
    public long C;
    public final /* synthetic */ float D;
    public final /* synthetic */ c8 E;
    public float r;
    public float s;
    public int v;
    public long w;
    public long x;
    public final k7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(c8 c8Var, Context context, float f10) {
        super(context);
        this.E = c8Var;
        this.D = f10;
        this.v = 0;
        this.y = new k7(this, 0);
        this.B = new k7(this, 1);
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
        c8 c8Var = this.E;
        l7 l7Var = c8Var.H;
        if (c8Var.Q.v || c8Var.E0 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        k7 k7Var = this.y;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.C = System.currentTimeMillis();
            c8Var.E0 = 0;
            AndroidUtilities.runOnUIThread(k7Var, 300L);
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
                float f13 = this.D;
                if (f12 > f13 * f13 && c8Var.E0 == 0) {
                    AndroidUtilities.cancelRunOnUIThread(k7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(k7Var);
        k7 k7Var2 = this.B;
        AndroidUtilities.cancelRunOnUIThread(k7Var2);
        if (c8Var.E0 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.C < 300) {
            MediaController.getInstance().playPreviousMessage();
            l7Var.setProgress(0.0f);
            l7Var.d();
        }
        if (this.v > 0) {
            this.x = 0L;
            k7Var2.run();
            MediaController.getInstance().resumeByRewind();
        }
        c8Var.F0 = -1.0f;
        setPressed(false);
        c8Var.E0 = 0;
        this.v = 0;
        return true;
    }
}
