package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.qv0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h5 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv0 b;

    public /* synthetic */ h5(qv0 qv0Var, int i10) {
        this.a = i10;
        this.b = qv0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 0:
                r6 r6Var = (r6) this.b;
                r6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var = r6Var.H1) != null && n1Var.isShowing()) {
                    view.getHitRect(r6Var.J1);
                    if (!r6Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        r6Var.H1.d(true);
                        break;
                    }
                }
                break;
            default:
                qg.p0 p0Var = (qg.p0) this.b;
                p0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = p0Var.R1) != null && n1Var2.isShowing()) {
                    view.getHitRect(p0Var.T1);
                    if (!p0Var.T1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        p0Var.R1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
