package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7 b;

    public /* synthetic */ a7(e7 e7Var, int i10) {
        this.a = i10;
        this.b = e7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                e7 e7Var = this.b;
                e7Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(bs.h).setDuration(280L).start();
                e7Var.c = System.currentTimeMillis();
                e7Var.invalidate();
                try {
                    e7Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(e7Var.h, 59500L);
                break;
        }
    }
}
