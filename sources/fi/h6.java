package fi;

import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
