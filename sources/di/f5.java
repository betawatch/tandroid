package di;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.pw0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f5 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pw0 b;

    public /* synthetic */ f5(pw0 pw0Var, int i10) {
        this.a = i10;
        this.b = pw0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 0:
                o6 o6Var = (o6) this.b;
                o6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (m1Var = o6Var.H1) != null && m1Var.isShowing()) {
                    view.getHitRect(o6Var.J1);
                    if (!o6Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        o6Var.H1.d(true);
                        break;
                    }
                }
                break;
            default:
                rg.o0 o0Var = (rg.o0) this.b;
                o0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = o0Var.R1) != null && m1Var2.isShowing()) {
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
