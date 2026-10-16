package bi;

import android.animation.ValueAnimator;
import org.telegram.ui.px;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ s(u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                px pxVar = this.b.b0;
                ValueAnimator valueAnimator = pxVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                pxVar.k0 = null;
                break;
            default:
                u uVar = this.b;
                uVar.w = false;
                uVar.invalidate();
                break;
        }
    }
}
