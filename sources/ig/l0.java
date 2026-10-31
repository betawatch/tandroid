package ig;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.t2;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ f1 c;

    public /* synthetic */ l0(q0 q0Var, f1 f1Var, int i10) {
        this.a = i10;
        this.b = q0Var;
        this.c = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        f1 f1Var = this.c;
        q0 q0Var = this.b;
        switch (i10) {
            case 0:
                q0Var.c = f1Var;
                if (q0Var.h == null) {
                    q0Var.h = new RectF();
                }
                q0Var.c.a(q0Var.h);
                a4.l lVar = q0Var.a;
                if (lVar != null) {
                    lVar.u();
                    break;
                }
                break;
            default:
                if (f1Var != null && q0Var.q == 0) {
                    q0Var.q = r1.b(q0Var.g);
                }
                int i11 = 0;
                if (q0Var.H == (f1Var != null)) {
                    if (f1Var != q0Var.d) {
                        q0Var.d = f1Var;
                        a4.l lVar2 = q0Var.a;
                        if (lVar2 != null) {
                            lVar2.u();
                            break;
                        }
                    }
                } else {
                    q0Var.H = f1Var != null;
                    ValueAnimator valueAnimator = q0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        q0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(q0Var.I, q0Var.H ? 1.0f : 0.0f);
                    q0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new j0(q0Var, i11));
                    q0Var.K.addListener(new p0(q0Var, i11));
                    q0Var.K.setInterpolator(gr.h);
                    q0Var.K.start();
                    q0Var.d = f1Var;
                    a4.l lVar3 = q0Var.a;
                    if (lVar3 != null) {
                        lVar3.u();
                    }
                    if (q0Var.H) {
                        t2.y.a();
                        break;
                    }
                }
                break;
        }
    }
}
