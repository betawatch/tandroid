package lh;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.av0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ av0 b;

    public /* synthetic */ w4(av0 av0Var, int i10) {
        this.a = i10;
        this.b = av0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                f6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var = f6Var.D1) != null && n1Var.isShowing()) {
                    view.getHitRect(f6Var.F1);
                    if (!f6Var.F1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        f6Var.D1.d(true);
                        break;
                    }
                }
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.b;
                l0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = l0Var.N1) != null && n1Var2.isShowing()) {
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
