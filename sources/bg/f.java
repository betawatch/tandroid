package bg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                AnimatorSet animatorSet = iVar.P;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = iVar.O) != null && valueAnimator.isRunning())) {
                    iVar.h(iVar.E);
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
