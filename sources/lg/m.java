package lg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
