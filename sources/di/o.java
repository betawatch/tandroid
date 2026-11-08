package di;

import android.animation.ValueAnimator;
import org.telegram.ui.pv;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ o(p pVar, int i7) {
        this.a = i7;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pv pvVar = this.b.b0;
                ValueAnimator valueAnimator = pvVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                pvVar.k0 = null;
                break;
            default:
                p pVar = this.b;
                pVar.x = false;
                pVar.invalidate();
                break;
        }
    }
}
