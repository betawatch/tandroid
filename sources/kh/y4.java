package kh;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.yu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yu0 b;

    public /* synthetic */ y4(yu0 yu0Var, int i9) {
        this.a = i9;
        this.b = yu0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 0:
                g6 g6Var = (g6) this.b;
                g6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = g6Var.D1) != null && o1Var.isShowing()) {
                    view.getHitRect(g6Var.F1);
                    if (!g6Var.F1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        g6Var.D1.d(true);
                        break;
                    }
                }
                break;
            default:
                yf.l0 l0Var = (yf.l0) this.b;
                l0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = l0Var.N1) != null && o1Var2.isShowing()) {
                    view.getHitRect(l0Var.P1);
                    if (!l0Var.P1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        l0Var.N1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
