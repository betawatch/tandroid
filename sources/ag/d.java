package ag;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import f2.a0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj, float f10, float f11, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = f10;
        this.c = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i9 = this.a;
        float f10 = this.c;
        float f11 = this.b;
        Object obj = this.d;
        switch (i9) {
            case 0:
                f fVar = (f) obj;
                j jVar = (j) fVar.b;
                ValueAnimator valueAnimator = jVar.O;
                b bVar = jVar.T;
                b bVar2 = jVar.S;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    jVar.O.cancel();
                    jVar.O = null;
                }
                AnimatorSet animatorSet = jVar.P;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    jVar.P.cancel();
                    jVar.P = null;
                }
                if (Math.abs(jVar.b.d) <= 10.0f) {
                    AndroidUtilities.cancelRunOnUIThread(jVar.Q);
                    jVar.P = new AnimatorSet();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(jVar.b.d, f11);
                    ofFloat.addUpdateListener(bVar2);
                    long j10 = 220;
                    ofFloat.setDuration(j10);
                    gr grVar = gr.h;
                    ofFloat.setInterpolator(grVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat2.addUpdateListener(bVar2);
                    ofFloat2.setStartDelay(j10);
                    ofFloat2.setDuration(600L);
                    ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(jVar.b.g, f10);
                    ofFloat3.addUpdateListener(bVar);
                    ofFloat3.setDuration(j10);
                    ofFloat3.setInterpolator(grVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat4.addUpdateListener(bVar);
                    ofFloat4.setStartDelay(j10);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                    jVar.P.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    jVar.P.addListener(new e(fVar, 0));
                    jVar.P.start();
                    break;
                } else {
                    jVar.i();
                    break;
                }
            default:
                wk0 wk0Var = (wk0) ((a0) obj).b;
                if (wk0Var.a1 != null && (view = wk0Var.J1) != null) {
                    wk0Var.h1(view, f11, f10, true);
                    wk0Var.a1 = null;
                    break;
                }
                break;
        }
    }
}
