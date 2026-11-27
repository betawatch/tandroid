// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class o10 extends e29 {
    public final /* synthetic */ j20 E;
    public float r;
    public float s;
    public boolean w;
    public final p1 x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o10(j20 j20Var, Activity activity, float f) {
        super(activity);
        this.E = j20Var;
        this.y = f;
        this.x = new p1(this, (byte) 3);
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
        j20 j20Var = this.E;
        o10 o10Var = j20Var.E1;
        if (j20Var.M1.x || j20Var.A2 == -1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        p1 p1Var = this.x;
        if (action == 0) {
            this.w = false;
            this.r = rawX;
            this.s = rawY;
            hl.d3(p1Var, 300L);
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
                    hl.r(p1Var);
                    setPressed(false);
                }
            }
            return true;
        }
        if (!this.w && motionEvent.getAction() == 1 && isPressed()) {
            MediaController.z().X(false);
            o10Var.setProgress(0.0f);
            o10Var.d();
        }
        hl.r(p1Var);
        if (j20Var.C2 > 0) {
            MediaController.z().o0(true, 1.0f);
            if (MediaController.z().G()) {
                j20Var.E2 = 0L;
                j20Var.H2.run();
            }
        }
        j20Var.A2 = 0;
        setPressed(false);
        j20Var.C2 = 0;
        j20Var.B2 = -1.0f;
        return true;
    }
}
