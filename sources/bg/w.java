package bg;

import android.view.MotionEvent;
import android.view.View;
import nh.t5;
import org.telegram.ui.Components.iv0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ iv0 b;

    public /* synthetic */ w(iv0 iv0Var, int i10) {
        this.a = i10;
        this.b = iv0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.b;
                g1Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = g1Var.N1) != null && o1Var.isShowing()) {
                    view.getHitRect(g1Var.P1);
                    if (!g1Var.P1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        g1Var.N1.d(true);
                        break;
                    }
                }
                break;
            default:
                t5 t5Var = (t5) this.b;
                t5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = t5Var.D1) != null && o1Var2.isShowing()) {
                    view.getHitRect(t5Var.F1);
                    if (!t5Var.F1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        t5Var.D1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
