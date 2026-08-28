package ih;

import android.animation.ValueAnimator;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ p(q qVar, int i9) {
        this.a = i9;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vw vwVar = this.b.U;
                ValueAnimator valueAnimator = vwVar.f0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                vwVar.g0 = null;
                break;
            default:
                q qVar = this.b;
                qVar.w = false;
                qVar.invalidate();
                break;
        }
    }
}
