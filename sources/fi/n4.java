package fi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n4 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ n4(int i7, FrameLayout frameLayout) {
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
                o5 o5Var = (o5) this.b;
                o5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var = o5Var.q1) != null && g1Var.isShowing()) {
                    view.getHitRect(o5Var.s1);
                    if (!o5Var.s1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        o5Var.q1.d(true);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.b;
                r0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = r0Var.d) != null && g1Var2.isShowing()) {
                    view.getHitRect(r0Var.I);
                    if (!r0Var.I.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        r0Var.d.d(true);
                        break;
                    }
                }
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.b;
                g0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var3 = g0Var.A1) != null && g1Var3.isShowing()) {
                    view.getHitRect(g0Var.C1);
                    if (!g0Var.C1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        g0Var.A1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
