package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.rv0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h5 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv0 b;

    public /* synthetic */ h5(rv0 rv0Var, int i10) {
        this.a = i10;
        this.b = rv0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 0:
                r6 r6Var = (r6) this.b;
                r6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = r6Var.H1) != null && o1Var.isShowing()) {
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
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = p0Var.R1) != null && o1Var2.isShowing()) {
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
