package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.nw0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class g5 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nw0 b;

    public /* synthetic */ g5(nw0 nw0Var, int i10) {
        this.a = i10;
        this.b = nw0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.b;
                q6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var = q6Var.H1) != null && n1Var.isShowing()) {
                    view.getHitRect(q6Var.J1);
                    if (!q6Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        q6Var.H1.d(true);
                        break;
                    }
                }
                break;
            default:
                qg.m0 m0Var = (qg.m0) this.b;
                m0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = m0Var.R1) != null && n1Var2.isShowing()) {
                    view.getHitRect(m0Var.T1);
                    if (!m0Var.T1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        m0Var.R1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
