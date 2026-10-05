package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o7 b;

    public /* synthetic */ k7(o7 o7Var, int i10) {
        this.a = i10;
        this.b = o7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                o7 o7Var = this.b;
                o7Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(tr.h).setDuration(280L).start();
                o7Var.c = System.currentTimeMillis();
                o7Var.invalidate();
                try {
                    o7Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(o7Var.h, 59500L);
                break;
        }
    }
}
