// default package

import android.widget.OverScroller;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mn9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nn9 b;

    public /* synthetic */ mn9(nn9 nn9Var, byte b) {
        this.a = b;
        this.b = nn9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nn9 nn9Var = this.b;
        switch (b) {
            case 0:
                nn9Var.requestLayout();
                break;
            default:
                on9 on9Var = nn9Var.P;
                OverScroller overScroller = nn9Var.r;
                if (!overScroller.computeScrollOffset()) {
                    if (on9Var.e0 + on9Var.i0 < a.getCurrentActionBarHeight() + on9Var.R.b && on9Var.i0 > (-nn9Var.f())) {
                        nn9Var.l(-nn9Var.f(), 0.0f, 180.0f);
                        break;
                    }
                } else {
                    int currY = overScroller.getCurrY();
                    float f = -nn9Var.f();
                    float f2 = currY;
                    nn9Var.k(f2);
                    if ((f2 > f && currY < 0) || overScroller.isFinished()) {
                        nn9Var.postOnAnimation(nn9Var.s);
                        break;
                    } else {
                        float min = currY >= 0 ? Math.min(overScroller.getCurrVelocity(), gl.L(1200.0f)) : -Math.min(overScroller.getCurrVelocity(), gl.L(2400.0f));
                        overScroller.abortAnimation();
                        nn9Var.l(currY < 0 ? f : 0.0f, min, 380.0f);
                        break;
                    }
                }
                break;
        }
    }
}
