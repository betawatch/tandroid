package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.tw;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                tw twVar = this.b.b0;
                ValueAnimator valueAnimator = twVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                twVar.k0 = null;
                break;
            default:
                q qVar = this.b;
                qVar.w = false;
                qVar.invalidate();
                break;
        }
    }
}
