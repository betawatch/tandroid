package ei;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.kw0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kw0 b;

    public /* synthetic */ x4(kw0 kw0Var, int i10) {
        this.a = i10;
        this.b = kw0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                f6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (m1Var = f6Var.H1) != null && m1Var.isShowing()) {
                    view.getHitRect(f6Var.J1);
                    if (!f6Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        f6Var.H1.d(true);
                        break;
                    }
                }
                break;
            default:
                rg.m0 m0Var = (rg.m0) this.b;
                m0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = m0Var.R1) != null && m1Var2.isShowing()) {
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
