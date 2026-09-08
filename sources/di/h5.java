package di;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class h5 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv0 b;

    public /* synthetic */ h5(pv0 pv0Var, int i10) {
        this.a = i10;
        this.b = pv0Var;
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
                rg.o0 o0Var = (rg.o0) this.b;
                o0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = o0Var.R1) != null && n1Var2.isShowing()) {
                    view.getHitRect(o0Var.T1);
                    if (!o0Var.T1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        o0Var.R1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
