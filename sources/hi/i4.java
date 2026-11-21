package hi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i4 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ i4(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        org.telegram.ui.ActionBar.g1 g1Var3;
        switch (this.a) {
            case 0:
                k5 k5Var = (k5) this.b;
                k5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var = k5Var.r1) != null && g1Var.isShowing()) {
                    view.getHitRect(k5Var.t1);
                    if (!k5Var.t1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        k5Var.r1.d(true);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.b;
                q0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = q0Var.d) != null && g1Var2.isShowing()) {
                    view.getHitRect(q0Var.J);
                    if (!q0Var.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        q0Var.d.d(true);
                        break;
                    }
                }
                break;
            default:
                tg.h0 h0Var = (tg.h0) this.b;
                h0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var3 = h0Var.B1) != null && g1Var3.isShowing()) {
                    view.getHitRect(h0Var.D1);
                    if (!h0Var.D1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        h0Var.B1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
