package fg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import cg.l0;
import f2.y;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj, float f10, float f11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f10;
        this.c = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i10 = this.a;
        float f10 = this.c;
        float f11 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                i iVar = (i) eVar.b;
                ValueAnimator valueAnimator = iVar.P;
                b bVar = iVar.U;
                b bVar2 = iVar.T;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    iVar.P.cancel();
                    iVar.P = null;
                }
                AnimatorSet animatorSet = iVar.Q;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    iVar.Q.cancel();
                    iVar.Q = null;
                }
                if (Math.abs(iVar.b.d) <= 10.0f) {
                    AndroidUtilities.cancelRunOnUIThread(iVar.R);
                    iVar.Q = new AnimatorSet();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(iVar.b.d, f11);
                    ofFloat.addUpdateListener(bVar2);
                    long j10 = 220;
                    ofFloat.setDuration(j10);
                    nr nrVar = nr.h;
                    ofFloat.setInterpolator(nrVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat2.addUpdateListener(bVar2);
                    ofFloat2.setStartDelay(j10);
                    ofFloat2.setDuration(600L);
                    ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(iVar.b.g, f10);
                    ofFloat3.addUpdateListener(bVar);
                    ofFloat3.setDuration(j10);
                    ofFloat3.setInterpolator(nrVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat4.addUpdateListener(bVar);
                    ofFloat4.setStartDelay(j10);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                    iVar.Q.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    iVar.Q.addListener(new l0(eVar, 5));
                    iVar.Q.start();
                    break;
                } else {
                    iVar.i();
                    break;
                }
            default:
                sl0 sl0Var = (sl0) ((y) obj).b;
                if (sl0Var.b1 != null && (view = sl0Var.K1) != null) {
                    sl0Var.h1(view, f11, f10, true);
                    sl0Var.b1 = null;
                    break;
                }
                break;
        }
    }
}
