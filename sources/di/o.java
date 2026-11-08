package di;

import android.animation.ValueAnimator;
import org.telegram.ui.pv;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
