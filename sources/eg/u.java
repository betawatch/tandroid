package eg;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.sv0;
import qh.b5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv0 b;

    public /* synthetic */ u(sv0 sv0Var, int i10) {
        this.a = i10;
        this.b = sv0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.b;
                c1Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var = c1Var.O1) != null && p1Var.isShowing()) {
                    view.getHitRect(c1Var.Q1);
                    if (!c1Var.Q1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        c1Var.O1.d(true);
                        break;
                    }
                }
                break;
            default:
                b5 b5Var = (b5) this.b;
                b5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = b5Var.E1) != null && p1Var2.isShowing()) {
                    view.getHitRect(b5Var.G1);
                    if (!b5Var.G1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        b5Var.E1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
