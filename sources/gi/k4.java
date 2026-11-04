package gi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ k4(int i3, FrameLayout frameLayout) {
        this.a = i3;
        this.b = frameLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f1 f1Var2;
        org.telegram.ui.ActionBar.f1 f1Var3;
        switch (this.a) {
            case 0:
                m5 m5Var = (m5) this.b;
                m5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (f1Var = m5Var.r1) != null && f1Var.isShowing()) {
                    view.getHitRect(m5Var.t1);
                    if (!m5Var.t1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        m5Var.r1.d(true);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.b;
                q0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (f1Var2 = q0Var.d) != null && f1Var2.isShowing()) {
                    view.getHitRect(q0Var.J);
                    if (!q0Var.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        q0Var.d.d(true);
                        break;
                    }
                }
                break;
            default:
                ug.f0 f0Var = (ug.f0) this.b;
                f0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (f1Var3 = f0Var.B1) != null && f1Var3.isShowing()) {
                    view.getHitRect(f0Var.D1);
                    if (!f0Var.D1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        f0Var.B1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
