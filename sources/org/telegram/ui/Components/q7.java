package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class q7 extends nj0 {
    public final p7 E;
    public long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ i8 H;
    public float r;
    public float s;
    public int v;
    public long w;
    public long x;
    public final p7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(i8 i8Var, Context context, float f7) {
        super(context);
        this.H = i8Var;
        this.G = f7;
        this.v = 0;
        this.y = new p7(this, 0);
        this.E = new p7(this, 1);
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
        i8 i8Var = this.H;
        q7 q7Var = i8Var.K;
        if (i8Var.T.v || i8Var.H0 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        p7 p7Var = this.y;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.F = System.currentTimeMillis();
            i8Var.H0 = 0;
            AndroidUtilities.runOnUIThread(p7Var, 300L);
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
                if (f11 > f12 * f12 && i8Var.H0 == 0) {
                    AndroidUtilities.cancelRunOnUIThread(p7Var);
                    setPressed(false);
                }
            }
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(p7Var);
        p7 p7Var2 = this.E;
        AndroidUtilities.cancelRunOnUIThread(p7Var2);
        if (i8Var.H0 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.F < 300) {
            MediaController.getInstance().playPreviousMessage();
            q7Var.setProgress(0.0f);
            q7Var.d();
        }
        if (this.v > 0) {
            this.x = 0L;
            p7Var2.run();
            MediaController.getInstance().resumeByRewind();
        }
        i8Var.I0 = -1.0f;
        setPressed(false);
        i8Var.H0 = 0;
        this.v = 0;
        return true;
    }
}
