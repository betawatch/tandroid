// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class n10 extends e29 {
    public final m10 E;
    public final m10 F;
    public long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ j20 I;
    public float r;
    public float s;
    public int w;
    public long x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n10(j20 j20Var, Activity activity, float f) {
        super(activity);
        this.I = j20Var;
        this.H = f;
        this.w = 0;
        this.E = new m10(this, (byte) 0);
        this.F = new m10(this, (byte) 1);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r6 != 3) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j20 j20Var = this.I;
        n10 n10Var = j20Var.D1;
        if (j20Var.M1.x || j20Var.A2 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        m10 m10Var = this.E;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.G = System.currentTimeMillis();
            j20Var.A2 = 0;
            hl.d3(m10Var, 300L);
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
                float f4 = this.H;
                if (f3 > f4 * f4 && j20Var.A2 == 0) {
                    hl.r(m10Var);
                    setPressed(false);
                }
            }
            return true;
        }
        hl.r(m10Var);
        m10 m10Var2 = this.F;
        hl.r(m10Var2);
        if (j20Var.A2 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.G < 300) {
            MediaController.z().Y();
            n10Var.setProgress(0.0f);
            n10Var.d();
        }
        if (this.w > 0) {
            this.y = 0L;
            m10Var2.run();
            MediaController.z().e0();
        }
        j20Var.B2 = -1.0f;
        setPressed(false);
        j20Var.A2 = 0;
        this.w = 0;
        return true;
    }
}
