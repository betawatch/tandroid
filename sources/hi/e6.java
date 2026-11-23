package hi;

import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i6 b;

    public /* synthetic */ e6(i6 i6Var, int i7) {
        this.a = i7;
        this.b = i6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                i6 i6Var = this.b;
                i6Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(nr.h).setDuration(280L).start();
                i6Var.c = System.currentTimeMillis();
                i6Var.invalidate();
                try {
                    i6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(i6Var.h, 59500L);
                break;
        }
    }
}
