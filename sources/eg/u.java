package eg;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.rv0;
import qh.a5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv0 b;

    public /* synthetic */ u(rv0 rv0Var, int i10) {
        this.a = i10;
        this.b = rv0Var;
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
                a5 a5Var = (a5) this.b;
                a5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = a5Var.E1) != null && p1Var2.isShowing()) {
                    view.getHitRect(a5Var.G1);
                    if (!a5Var.G1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        a5Var.E1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
