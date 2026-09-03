package dg;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.rv0;
import ph.c5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv0 b;

    public /* synthetic */ v(rv0 rv0Var, int i10) {
        this.a = i10;
        this.b = rv0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.b;
                e1Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var = e1Var.O1) != null && p1Var.isShowing()) {
                    view.getHitRect(e1Var.Q1);
                    if (!e1Var.Q1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        e1Var.O1.d(true);
                        break;
                    }
                }
                break;
            default:
                c5 c5Var = (c5) this.b;
                c5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = c5Var.E1) != null && p1Var2.isShowing()) {
                    view.getHitRect(c5Var.G1);
                    if (!c5Var.G1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        c5Var.E1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
