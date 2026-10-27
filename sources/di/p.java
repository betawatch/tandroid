package di;

import android.animation.ValueAnimator;
import org.telegram.ui.sw;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                sw swVar = this.b.b0;
                ValueAnimator valueAnimator = swVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                swVar.k0 = null;
                break;
            default:
                q qVar = this.b;
                qVar.w = false;
                qVar.invalidate();
                break;
        }
    }
}
