package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.bw0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g5 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ g5(bw0 bw0Var, int i10) {
        this.a = i10;
        this.b = bw0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.b;
                q6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (m1Var = q6Var.H1) != null && m1Var.isShowing()) {
                    view.getHitRect(q6Var.J1);
                    if (!q6Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        q6Var.H1.d(true);
                        break;
                    }
                }
                break;
            default:
                qg.n0 n0Var = (qg.n0) this.b;
                n0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = n0Var.R1) != null && m1Var2.isShowing()) {
                    view.getHitRect(n0Var.T1);
                    if (!n0Var.T1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        n0Var.R1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
