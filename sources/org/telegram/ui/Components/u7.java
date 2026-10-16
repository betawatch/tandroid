package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class u7 extends bk0 {
    public final t7 E;
    public long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ m8 H;
    public float r;
    public float s;
    public int v;
    public long w;
    public long x;
    public final t7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(m8 m8Var, Context context, float f7) {
        super(context);
        this.H = m8Var;
        this.G = f7;
        this.v = 0;
        this.y = new t7(this, 0);
        this.E = new t7(this, 1);
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
        m8 m8Var = this.H;
        u7 u7Var = m8Var.K;
        if (m8Var.T.v || m8Var.H0 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        t7 t7Var = this.y;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.F = System.currentTimeMillis();
            m8Var.H0 = 0;
            AndroidUtilities.runOnUIThread(t7Var, 300L);
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
                if (f11 > f12 * f12 && m8Var.H0 == 0) {
                    AndroidUtilities.cancelRunOnUIThread(t7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(t7Var);
        t7 t7Var2 = this.E;
        AndroidUtilities.cancelRunOnUIThread(t7Var2);
        if (m8Var.H0 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.F < 300) {
            MediaController.getInstance().playPreviousMessage();
            u7Var.setProgress(0.0f);
            u7Var.d();
        }
        if (this.v > 0) {
            this.x = 0L;
            t7Var2.run();
            MediaController.getInstance().resumeByRewind();
        }
        m8Var.I0 = -1.0f;
        setPressed(false);
        m8Var.H0 = 0;
        this.v = 0;
        return true;
    }
}
