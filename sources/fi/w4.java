package fi;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.xw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xw0 b;

    public /* synthetic */ w4(xw0 xw0Var, int i10) {
        this.a = i10;
        this.b = xw0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.b;
                e6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = e6Var.w1) != null && o1Var.isShowing()) {
                    view.getHitRect(e6Var.y1);
                    if (!e6Var.y1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        e6Var.w1.d(true);
                        break;
                    }
                }
                break;
            default:
                sg.m0 m0Var = (sg.m0) this.b;
                m0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = m0Var.G1) != null && o1Var2.isShowing()) {
                    view.getHitRect(m0Var.I1);
                    if (!m0Var.I1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        m0Var.G1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
