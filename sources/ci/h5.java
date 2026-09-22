package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.dw0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class h5 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dw0 b;

    public /* synthetic */ h5(dw0 dw0Var, int i10) {
        this.a = i10;
        this.b = dw0Var;
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
                qg.n0 n0Var = (qg.n0) this.b;
                n0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = n0Var.R1) != null && n1Var2.isShowing()) {
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
