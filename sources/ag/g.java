package ag;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ g(j jVar, int i9) {
        this.a = i9;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.a) {
            case 0:
                j jVar = this.b;
                AnimatorSet animatorSet = jVar.P;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = jVar.O) != null && valueAnimator.isRunning())) {
                    jVar.h(jVar.E);
                    break;
                } else {
                    jVar.k();
                    break;
                }
            default:
                this.b.i();
                break;
        }
    }
}
