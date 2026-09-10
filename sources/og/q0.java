package og;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ k1 c;

    public /* synthetic */ q0(v0 v0Var, k1 k1Var, int i10) {
        this.a = i10;
        this.b = v0Var;
        this.c = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        k1 k1Var = this.c;
        v0 v0Var = this.b;
        switch (i10) {
            case 0:
                v0Var.c = k1Var;
                if (v0Var.h == null) {
                    v0Var.h = new RectF();
                }
                v0Var.c.a(v0Var.h);
                l2.h hVar = v0Var.a;
                if (hVar != null) {
                    hVar.n();
                    break;
                }
                break;
            default:
                if (k1Var != null && v0Var.q == 0) {
                    v0Var.q = w1.b(v0Var.g);
                }
                int i11 = 0;
                if (v0Var.H == (k1Var != null)) {
                    if (k1Var != v0Var.d) {
                        v0Var.d = k1Var;
                        l2.h hVar2 = v0Var.a;
                        if (hVar2 != null) {
                            hVar2.n();
                            break;
                        }
                    }
                } else {
                    v0Var.H = k1Var != null;
                    ValueAnimator valueAnimator = v0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        v0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(v0Var.I, v0Var.H ? 1.0f : 0.0f);
                    v0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new o0(v0Var, i11));
                    v0Var.K.addListener(new t0(v0Var, i11));
                    v0Var.K.setInterpolator(wr.h);
                    v0Var.K.start();
                    v0Var.d = k1Var;
                    l2.h hVar3 = v0Var.a;
                    if (hVar3 != null) {
                        hVar3.n();
                    }
                    if (v0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        break;
                    }
                }
                break;
        }
    }
}
