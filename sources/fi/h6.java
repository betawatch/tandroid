package fi;

import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    public /* synthetic */ h6(l6 l6Var, int i7) {
        this.a = i7;
        this.b = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                l6 l6Var = this.b;
                l6Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(xq.h).setDuration(280L).start();
                l6Var.c = System.currentTimeMillis();
                l6Var.invalidate();
                try {
                    l6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.i3(l6Var.h, 59500L);
                break;
        }
    }
}
