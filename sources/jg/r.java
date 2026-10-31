package jg;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import vh.b4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ r(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        org.telegram.ui.ActionBar.k1 k1Var2;
        org.telegram.ui.ActionBar.k1 k1Var3;
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.b;
                r0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (k1Var = r0Var.A1) != null && k1Var.isShowing()) {
                    view.getHitRect(r0Var.C1);
                    if (!r0Var.C1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        r0Var.A1.d(true);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.b;
                t0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (k1Var2 = t0Var.d) != null && k1Var2.isShowing()) {
                    view.getHitRect(t0Var.I);
                    if (!t0Var.I.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        t0Var.d.d(true);
                        break;
                    }
                }
                break;
            default:
                b4 b4Var = (b4) this.b;
                b4Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (k1Var3 = b4Var.q1) != null && k1Var3.isShowing()) {
                    view.getHitRect(b4Var.s1);
                    if (!b4Var.s1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        b4Var.q1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
