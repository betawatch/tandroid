package hi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ k4(int i7, FrameLayout frameLayout) {
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
                m5 m5Var = (m5) this.b;
                m5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var = m5Var.r1) != null && g1Var.isShowing()) {
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
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = q0Var.d) != null && g1Var2.isShowing()) {
                    view.getHitRect(q0Var.J);
                    if (!q0Var.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        q0Var.d.d(true);
                        break;
                    }
                }
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.b;
                g0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var3 = g0Var.B1) != null && g1Var3.isShowing()) {
                    view.getHitRect(g0Var.D1);
                    if (!g0Var.D1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        g0Var.B1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
