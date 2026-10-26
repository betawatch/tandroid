package fi;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ww0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww0 b;

    public /* synthetic */ w4(ww0 ww0Var, int i10) {
        this.a = i10;
        this.b = ww0Var;
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
                sg.n0 n0Var = (sg.n0) this.b;
                n0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = n0Var.G1) != null && o1Var2.isShowing()) {
                    view.getHitRect(n0Var.I1);
                    if (!n0Var.I1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        n0Var.G1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
