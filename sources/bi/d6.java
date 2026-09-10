package bi;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.bw0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class d6 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ d6(bw0 bw0Var, int i10) {
        this.a = i10;
        this.b = bw0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.b;
                r7Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var = r7Var.H1) != null && p1Var.isShowing()) {
                    view.getHitRect(r7Var.J1);
                    if (!r7Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        r7Var.H1.d(true);
                        break;
                    }
                }
                break;
            default:
                pg.m0 m0Var = (pg.m0) this.b;
                m0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = m0Var.R1) != null && p1Var2.isShowing()) {
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
