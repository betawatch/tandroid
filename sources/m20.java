// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m20 extends s09 {
    public final l20 E;
    public final l20 F;
    public long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ i30 I;
    public float r;
    public float s;
    public int w;
    public long x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m20(i30 i30Var, Activity activity, float f) {
        super(activity);
        this.I = i30Var;
        this.H = f;
        this.w = 0;
        this.E = new l20(this, (byte) 0);
        this.F = new l20(this, (byte) 1);
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
        i30 i30Var = this.I;
        m20 m20Var = i30Var.D1;
        if (i30Var.M1.x || i30Var.A2 == 1) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        l20 l20Var = this.E;
        if (action == 0) {
            this.r = rawX;
            this.s = rawY;
            this.G = System.currentTimeMillis();
            i30Var.A2 = 0;
            gm.d3(l20Var, 300L);
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
                if (f3 > f4 * f4 && i30Var.A2 == 0) {
                    gm.r(l20Var);
                    setPressed(false);
                }
            }
            return true;
        }
        gm.r(l20Var);
        l20 l20Var2 = this.F;
        gm.r(l20Var2);
        if (i30Var.A2 == 0 && motionEvent.getAction() == 1 && System.currentTimeMillis() - this.G < 300) {
            MediaController.w().U();
            m20Var.setProgress(0.0f);
            m20Var.d();
        }
        if (this.w > 0) {
            this.y = 0L;
            l20Var2.run();
            MediaController.w().b0();
        }
        i30Var.B2 = -1.0f;
        setPressed(false);
        i30Var.A2 = 0;
        this.w = 0;
        return true;
    }
}
