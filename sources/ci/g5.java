package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.qv0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class g5 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv0 b;

    public /* synthetic */ g5(qv0 qv0Var, int i10) {
        this.a = i10;
        this.b = qv0Var;
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
