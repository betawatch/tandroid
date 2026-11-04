package gi;

import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6 b;

    public /* synthetic */ i6(m6 m6Var, int i3) {
        this.a = i3;
        this.b = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                m6 m6Var = this.b;
                m6Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(xq.h).setDuration(280L).start();
                m6Var.c = System.currentTimeMillis();
                m6Var.invalidate();
                try {
                    m6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.i3(m6Var.h, 59500L);
                break;
        }
    }
}
