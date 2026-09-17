package bi;

import android.animation.ValueAnimator;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
                lx lxVar = this.b.b0;
                ValueAnimator valueAnimator = lxVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                lxVar.k0 = null;
                break;
            default:
                u uVar = this.b;
                uVar.w = false;
                uVar.invalidate();
                break;
        }
    }
}
