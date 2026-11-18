package hi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ j4(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.h1 h1Var;
        org.telegram.ui.ActionBar.h1 h1Var2;
        org.telegram.ui.ActionBar.h1 h1Var3;
        switch (this.a) {
            case 0:
                l5 l5Var = (l5) this.b;
                l5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (h1Var = l5Var.r1) != null && h1Var.isShowing()) {
                    view.getHitRect(l5Var.t1);
                    if (!l5Var.t1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        l5Var.r1.d(true);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.b;
                r0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (h1Var2 = r0Var.d) != null && h1Var2.isShowing()) {
                    view.getHitRect(r0Var.J);
                    if (!r0Var.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        r0Var.d.d(true);
                        break;
                    }
                }
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.b;
                g0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (h1Var3 = g0Var.B1) != null && h1Var3.isShowing()) {
                    view.getHitRect(g0Var.D1);
                    if (!g0Var.D1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        g0Var.B1.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
