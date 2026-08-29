package ag;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ w1 c;

    public /* synthetic */ a1(f1 f1Var, w1 w1Var, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.c = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        w1 w1Var = this.c;
        f1 f1Var = this.b;
        switch (i10) {
            case 0:
                f1Var.c = w1Var;
                if (f1Var.h == null) {
                    f1Var.h = new RectF();
                }
                f1Var.c.a(f1Var.h);
                o1 o1Var = f1Var.a;
                if (o1Var != null) {
                    o1Var.c();
                    break;
                }
                break;
            default:
                if (w1Var != null && f1Var.q == 0) {
                    f1Var.q = l2.b(f1Var.g);
                }
                int i11 = 0;
                if (f1Var.H == (w1Var != null)) {
                    if (w1Var != f1Var.d) {
                        f1Var.d = w1Var;
                        o1 o1Var2 = f1Var.a;
                        if (o1Var2 != null) {
                            o1Var2.c();
                            break;
                        }
                    }
                } else {
                    f1Var.H = w1Var != null;
                    ValueAnimator valueAnimator = f1Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        f1Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f1Var.I, f1Var.H ? 1.0f : 0.0f);
                    f1Var.K = ofFloat;
                    ofFloat.addUpdateListener(new y0(f1Var, i11));
                    f1Var.K.addListener(new e1(f1Var, i11));
                    f1Var.K.setInterpolator(jr.h);
                    f1Var.K.start();
                    f1Var.d = w1Var;
                    o1 o1Var3 = f1Var.a;
                    if (o1Var3 != null) {
                        o1Var3.c();
                    }
                    if (f1Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        break;
                    }
                }
                break;
        }
    }
}
