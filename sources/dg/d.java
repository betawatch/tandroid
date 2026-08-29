package dg;

import ag.m0;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import f2.y;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj, float f9, float f10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f9;
        this.c = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i10 = this.a;
        float f9 = this.c;
        float f10 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                i iVar = (i) eVar.b;
                ValueAnimator valueAnimator = iVar.O;
                b bVar = iVar.T;
                b bVar2 = iVar.S;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    iVar.O.cancel();
                    iVar.O = null;
                }
                AnimatorSet animatorSet = iVar.P;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    iVar.P.cancel();
                    iVar.P = null;
                }
                if (Math.abs(iVar.b.d) <= 10.0f) {
                    AndroidUtilities.cancelRunOnUIThread(iVar.Q);
                    iVar.P = new AnimatorSet();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(iVar.b.d, f10);
                    ofFloat.addUpdateListener(bVar2);
                    long j10 = 220;
                    ofFloat.setDuration(j10);
                    jr jrVar = jr.h;
                    ofFloat.setInterpolator(jrVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat2.addUpdateListener(bVar2);
                    ofFloat2.setStartDelay(j10);
                    ofFloat2.setDuration(600L);
                    ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(iVar.b.g, f9);
                    ofFloat3.addUpdateListener(bVar);
                    ofFloat3.setDuration(j10);
                    ofFloat3.setInterpolator(jrVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f9, 0.0f);
                    ofFloat4.addUpdateListener(bVar);
                    ofFloat4.setStartDelay(j10);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                    iVar.P.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    iVar.P.addListener(new m0(eVar, 5));
                    iVar.P.start();
                    break;
                } else {
                    iVar.i();
                    break;
                }
            default:
                jl0 jl0Var = (jl0) ((y) obj).b;
                if (jl0Var.a1 != null && (view = jl0Var.J1) != null) {
                    jl0Var.h1(view, f10, f9, true);
                    jl0Var.a1 = null;
                    break;
                }
                break;
        }
    }
}
