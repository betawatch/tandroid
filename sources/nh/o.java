package nh;

import android.animation.ValueAnimator;
import org.telegram.ui.ix;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                ix ixVar = this.b.V;
                ValueAnimator valueAnimator = ixVar.g0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                ixVar.h0 = null;
                break;
            default:
                p pVar = this.b;
                pVar.w = false;
                pVar.invalidate();
                break;
        }
    }
}
