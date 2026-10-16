package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
