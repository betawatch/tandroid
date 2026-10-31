package lg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(Object obj, float f7, float f10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f7;
        this.c = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i10 = this.a;
        float f7 = this.c;
        float f10 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                l lVar = (l) obj;
                q qVar = lVar.b;
                ValueAnimator valueAnimator = qVar.c0;
                i iVar = qVar.h0;
                i iVar2 = qVar.g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    qVar.c0.cancel();
                    qVar.c0 = null;
                }
                AnimatorSet animatorSet = qVar.d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    qVar.d0.cancel();
                    qVar.d0 = null;
                }
                if (Math.abs(qVar.b.d) <= 10.0f) {
                    i0.r(qVar.e0);
                    qVar.d0 = new AnimatorSet();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(qVar.b.d, f10);
                    ofFloat.addUpdateListener(iVar2);
                    long j10 = zs.x3;
                    ofFloat.setDuration(j10);
                    gr grVar = gr.h;
                    ofFloat.setInterpolator(grVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat2.addUpdateListener(iVar2);
                    ofFloat2.setStartDelay(j10);
                    ofFloat2.setDuration(600L);
                    OvershootInterpolator overshootInterpolator = i0.H;
                    ofFloat2.setInterpolator(overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(qVar.b.i, f7);
                    ofFloat3.addUpdateListener(iVar);
                    ofFloat3.setDuration(j10);
                    ofFloat3.setInterpolator(grVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                    ofFloat4.addUpdateListener(iVar);
                    ofFloat4.setStartDelay(j10);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(overshootInterpolator);
                    qVar.d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    qVar.d0.addListener(new bg.e(lVar, 11));
                    qVar.d0.start();
                    break;
                } else {
                    qVar.l();
                    break;
                }
            default:
                tk0 tk0Var = (tk0) ((mk0) obj).b;
                if (tk0Var.c1 != null && (view = tk0Var.L1) != null) {
                    tk0Var.j1(view, f10, f7, true);
                    tk0Var.c1 = null;
                    break;
                }
                break;
        }
    }
}
