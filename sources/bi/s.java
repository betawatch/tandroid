package bi;

import android.animation.ValueAnimator;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
