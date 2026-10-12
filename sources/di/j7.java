package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n7 b;

    public /* synthetic */ j7(n7 n7Var, int i10) {
        this.a = i10;
        this.b = n7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                n7 n7Var = this.b;
                n7Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(es.h).setDuration(280L).start();
                n7Var.c = System.currentTimeMillis();
                n7Var.invalidate();
                try {
                    n7Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(n7Var.h, 59500L);
                break;
        }
    }
}
