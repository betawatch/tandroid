// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class m10 extends ry8 {
    public final l10 E;
    public final l10 F;
    public long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ i20 I;
    public float r;
    public float s;
    public int w;
    public long x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m10(i20 i20Var, Activity activity, float f) {
        super(activity);
        this.I = i20Var;
        this.H = f;
        this.w = 0;
        this.E = new l10(this, (byte) 0);
        this.F = new l10(this, (byte) 1);
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
        i20 i20Var = this.I;
        m10 m10Var = i20Var.D1;
        if (i20Var.M1.x || i20Var.A2 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        l10 l10Var = this.E;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.G = System.currentTimeMillis();
            i20Var.A2 = 0;
            gl.e3(l10Var, 300L);
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
                if (f3 > f4 * f4 && i20Var.A2 == 0) {
                    gl.r(l10Var);
                    setPressed(false);
                }
            }
            return true;
        }
        gl.r(l10Var);
        l10 l10Var2 = this.F;
        gl.r(l10Var2);
        if (i20Var.A2 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.G < 300) {
            MediaController.w().U();
            m10Var.setProgress(0.0f);
            m10Var.d();
        }
        if (this.w > 0) {
            this.y = 0L;
            l10Var2.run();
            MediaController.w().b0();
        }
        i20Var.B2 = -1.0f;
        setPressed(false);
        i20Var.A2 = 0;
        this.w = 0;
        return true;
    }
}
