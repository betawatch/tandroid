package hi;

import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j6 b;

    public /* synthetic */ f6(j6 j6Var, int i7) {
        this.a = i7;
        this.b = j6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                j6 j6Var = this.b;
                j6Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(lr.h).setDuration(280L).start();
                j6Var.c = System.currentTimeMillis();
                j6Var.invalidate();
                try {
                    j6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(j6Var.h, 59500L);
                break;
        }
    }
}
