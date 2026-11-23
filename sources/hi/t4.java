package hi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ t4(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        org.telegram.ui.ActionBar.g1 g1Var3;
        switch (this.a) {
            case 0:
                v5 v5Var = (v5) this.b;
                v5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var = v5Var.r1) != null && g1Var.isShowing()) {
                    view.getHitRect(v5Var.t1);
                    if (!v5Var.t1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        v5Var.r1.d(true);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.b;
                q0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = q0Var.d) != null && g1Var2.isShowing()) {
                    view.getHitRect(q0Var.J);
                    if (!q0Var.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        q0Var.d.d(true);
                        break;
                    }
                }
                break;
            default:
                tg.l0 l0Var = (tg.l0) this.b;
                l0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var3 = l0Var.B1) != null && g1Var3.isShowing()) {
                    view.getHitRect(l0Var.D1);
                    if (!l0Var.D1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        l0Var.B1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
