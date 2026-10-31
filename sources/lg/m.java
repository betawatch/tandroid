package lg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ m(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.a) {
            case 0:
                q qVar = this.b;
                AnimatorSet animatorSet = qVar.d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = qVar.c0) != null && valueAnimator.isRunning())) {
                    qVar.j(qVar.L);
                    break;
                } else {
                    qVar.n();
                    break;
                }
            default:
                this.b.l();
                break;
        }
    }
}
