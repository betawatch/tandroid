package nh;

import android.animation.ValueAnimator;
import org.telegram.ui.gx;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ o(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gx gxVar = this.b.V;
                ValueAnimator valueAnimator = gxVar.g0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                gxVar.h0 = null;
                break;
            default:
                p pVar = this.b;
                pVar.w = false;
                pVar.invalidate();
                break;
        }
    }
}
