// default package

import android.widget.OverScroller;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class np9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ op9 b;

    public /* synthetic */ np9(op9 op9Var, byte b) {
        this.a = b;
        this.b = op9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        op9 op9Var = this.b;
        switch (b) {
            case 0:
                op9Var.requestLayout();
                break;
            default:
                pp9 pp9Var = op9Var.P;
                OverScroller overScroller = op9Var.r;
                if (!overScroller.computeScrollOffset()) {
                    if (pp9Var.e0 + pp9Var.i0 < a.getCurrentActionBarHeight() + pp9Var.R.b && pp9Var.i0 > (-op9Var.f())) {
                        op9Var.l(-op9Var.f(), 0.0f, 180.0f);
                        break;
                    }
                } else {
                    int currY = overScroller.getCurrY();
                    float f = -op9Var.f();
                    float f2 = currY;
                    op9Var.k(f2);
                    if ((f2 > f && currY < 0) || overScroller.isFinished()) {
                        op9Var.postOnAnimation(op9Var.s);
                        break;
                    } else {
                        float min = currY >= 0 ? Math.min(overScroller.getCurrVelocity(), gm.L(1200.0f)) : -Math.min(overScroller.getCurrVelocity(), gm.L(2400.0f));
                        overScroller.abortAnimation();
                        op9Var.l(currY < 0 ? f : 0.0f, min, 380.0f);
                        break;
                    }
                }
                break;
        }
    }
}
