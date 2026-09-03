package gg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ f(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.a) {
            case 0:
                i iVar = this.b;
                AnimatorSet animatorSet = iVar.Q;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = iVar.P) != null && valueAnimator.isRunning())) {
                    iVar.h(iVar.F);
                    break;
                } else {
                    iVar.k();
                    break;
                }
            default:
                this.b.i();
                break;
        }
    }
}
