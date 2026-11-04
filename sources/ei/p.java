package ei;

import android.animation.ValueAnimator;
import org.telegram.ui.mv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ p(q qVar, int i3) {
        this.a = i3;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mv mvVar = this.b.c0;
                ValueAnimator valueAnimator = mvVar.k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                mvVar.l0 = null;
                break;
            default:
                q qVar = this.b;
                qVar.x = false;
                qVar.invalidate();
                break;
        }
    }
}
