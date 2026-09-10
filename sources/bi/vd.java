package bi;

import android.animation.ValueAnimator;
import org.telegram.ui.nx;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class vd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zh.k b;

    public /* synthetic */ vd(zh.k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zh.k kVar = this.b;
                kVar.w = false;
                kVar.invalidate();
                break;
            default:
                nx nxVar = this.b.b0;
                ValueAnimator valueAnimator = nxVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                nxVar.k0 = null;
                break;
        }
    }
}
