package lh;

import android.animation.ValueAnimator;
import org.telegram.ui.xw;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ n(o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xw xwVar = this.b.U;
                ValueAnimator valueAnimator = xwVar.f0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                xwVar.g0 = null;
                break;
            default:
                o oVar = this.b;
                oVar.w = false;
                oVar.invalidate();
                break;
        }
    }
}
