// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n10 extends ry8 {
    public final /* synthetic */ i20 E;
    public float r;
    public float s;
    public boolean w;
    public final o1 x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n10(i20 i20Var, Activity activity, float f) {
        super(activity);
        this.E = i20Var;
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
        i20 i20Var = this.E;
        n10 n10Var = i20Var.E1;
        if (i20Var.M1.x || i20Var.A2 == -1) {
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
            gl.d3(o1Var, 300L);
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
                    gl.r(o1Var);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.w && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.w().T(false);
            n10Var.setProgress(0.0f);
            n10Var.d();
        }
        gl.r(o1Var);
        if (i20Var.C2 > 0) {
            MediaController.w().l0(true, 1.0f);
            if (MediaController.w().C()) {
                i20Var.E2 = 0L;
                i20Var.H2.run();
            }
        }
        i20Var.A2 = 0;
        setPressed(false);
        i20Var.C2 = 0;
        i20Var.B2 = -1.0f;
        return true;
    }
}
