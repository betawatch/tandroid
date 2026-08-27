package jh;

import android.animation.ValueAnimator;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                yw ywVar = this.b.U;
                ValueAnimator valueAnimator = ywVar.f0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                ywVar.g0 = null;
                break;
            default:
                o oVar = this.b;
                oVar.w = false;
                oVar.invalidate();
                break;
        }
    }
}
