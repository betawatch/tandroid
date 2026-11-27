// default package

import android.widget.OverScroller;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class cr9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dr9 b;

    public /* synthetic */ cr9(dr9 dr9Var, byte b) {
        this.a = b;
        this.b = dr9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dr9 dr9Var = this.b;
        switch (b) {
            case 0:
                dr9Var.requestLayout();
                break;
            default:
                er9 er9Var = dr9Var.P;
                OverScroller overScroller = dr9Var.r;
                if (!overScroller.computeScrollOffset()) {
                    if (er9Var.e0 + er9Var.i0 < a.getCurrentActionBarHeight() + er9Var.R.b && er9Var.i0 > (-dr9Var.f())) {
                        dr9Var.l(-dr9Var.f(), 0.0f, 180.0f);
                        break;
                    }
                } else {
                    int currY = overScroller.getCurrY();
                    float f = -dr9Var.f();
                    float f2 = currY;
                    dr9Var.k(f2);
                    if ((f2 > f && currY < 0) || overScroller.isFinished()) {
                        dr9Var.postOnAnimation(dr9Var.s);
                        break;
                    } else {
                        float min = currY >= 0 ? Math.min(overScroller.getCurrVelocity(), hl.L(1200.0f)) : -Math.min(overScroller.getCurrVelocity(), hl.L(2400.0f));
                        overScroller.abortAnimation();
                        dr9Var.l(currY < 0 ? f : 0.0f, min, 380.0f);
                        break;
                    }
                }
                break;
        }
    }
}
