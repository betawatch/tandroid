package hi;

import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k6 b;

    public /* synthetic */ g6(k6 k6Var, int i7) {
        this.a = i7;
        this.b = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                k6 k6Var = this.b;
                k6Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(er.h).setDuration(280L).start();
                k6Var.c = System.currentTimeMillis();
                k6Var.invalidate();
                try {
                    k6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.i3(k6Var.h, 59500L);
                break;
        }
    }
}
