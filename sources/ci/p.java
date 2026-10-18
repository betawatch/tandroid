package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ p(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vw vwVar = this.b.b0;
                ValueAnimator valueAnimator = vwVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                vwVar.k0 = null;
                break;
            default:
                q qVar = this.b;
                qVar.w = false;
                qVar.invalidate();
                break;
        }
    }
}
