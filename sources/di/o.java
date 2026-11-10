package di;

import android.animation.ValueAnimator;
import org.telegram.ui.sv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                sv svVar = this.b.b0;
                ValueAnimator valueAnimator = svVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                svVar.k0 = null;
                break;
            default:
                p pVar = this.b;
                pVar.x = false;
                pVar.invalidate();
                break;
        }
    }
}
