package fg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
