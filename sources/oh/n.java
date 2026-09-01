package oh;

import android.animation.ValueAnimator;
import org.telegram.ui.hx;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                hx hxVar = this.b.V;
                ValueAnimator valueAnimator = hxVar.g0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                hxVar.h0 = null;
                break;
            default:
                o oVar = this.b;
                oVar.w = false;
                oVar.invalidate();
                break;
        }
    }
}
