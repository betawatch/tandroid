package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m7 extends lj0 {
    public float r;
    public float s;
    public boolean v;
    public final m2.b w;
    public final /* synthetic */ float x;
    public final /* synthetic */ c8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(c8 c8Var, Context context, float f10) {
        super(context);
        this.y = c8Var;
        this.x = f10;
        this.w = new m2.b(this, 12);
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
        c8 c8Var = this.y;
        m7 m7Var = c8Var.I;
        if (c8Var.Q.v || c8Var.E0 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        m2.b bVar = this.w;
        if (action == 0) {
            this.v = false;
            this.r = rawX;
            this.s = rawY;
            AndroidUtilities.runOnUIThread(bVar, 300L);
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
                float f13 = this.x;
                if (f12 > f13 * f13 && !this.v) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.v && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.getInstance().playNextMessage();
            m7Var.setProgress(0.0f);
            m7Var.d();
        }
        AndroidUtilities.cancelRunOnUIThread(bVar);
        if (c8Var.G0 > 0) {
            MediaController.getInstance().setPlaybackSpeed(true, 1.0f);
            if (MediaController.getInstance().isMessagePaused()) {
                c8Var.I0 = 0L;
                c8Var.K0.run();
            }
        }
        c8Var.E0 = 0;
        setPressed(false);
        c8Var.G0 = 0;
        c8Var.F0 = -1.0f;
        return true;
    }
}
