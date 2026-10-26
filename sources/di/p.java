package di;

import android.animation.ValueAnimator;
import org.telegram.ui.qw;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                qw qwVar = this.b.b0;
                ValueAnimator valueAnimator = qwVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                qwVar.k0 = null;
                break;
            default:
                q qVar = this.b;
                qVar.w = false;
                qVar.invalidate();
                break;
        }
    }
}
