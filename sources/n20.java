// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n20 extends s09 {
    public final /* synthetic */ i30 E;
    public float r;
    public float s;
    public boolean w;
    public final o1 x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n20(i30 i30Var, Activity activity, float f) {
        super(activity);
        this.E = i30Var;
        this.y = f;
        this.x = new o1(this, (byte) 3);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r5 != 3) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i30 i30Var = this.E;
        n20 n20Var = i30Var.E1;
        if (i30Var.M1.x || i30Var.A2 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        o1 o1Var = this.x;
        if (action == 0) {
            this.w = false;
            this.r = rawX;
            this.s = rawY;
            gm.d3(o1Var, 300L);
            if (getBackground() != null) {
                getBackground().setHotspot(this.r, this.s);
            }
            setPressed(true);
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f = rawX - this.r;
                float f2 = rawY - this.s;
                float f3 = (f2 * f2) + (f * f);
                float f4 = this.y;
                if (f3 > f4 * f4 && !this.w) {
                    gm.r(o1Var);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.w && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.w().T(false);
            n20Var.setProgress(0.0f);
            n20Var.d();
        }
        gm.r(o1Var);
        if (i30Var.C2 > 0) {
            MediaController.w().l0(true, 1.0f);
            if (MediaController.w().C()) {
                i30Var.E2 = 0L;
                i30Var.H2.run();
            }
        }
        i30Var.A2 = 0;
        setPressed(false);
        i30Var.C2 = 0;
        i30Var.B2 = -1.0f;
        return true;
    }
}
