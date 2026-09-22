package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class m7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q7 b;

    public /* synthetic */ m7(q7 q7Var, int i10) {
        this.a = i10;
        this.b = q7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                q7 q7Var = this.b;
                q7Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(qr.h).setDuration(280L).start();
                q7Var.c = System.currentTimeMillis();
                q7Var.invalidate();
                try {
                    q7Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(q7Var.h, 59500L);
                break;
        }
    }
}
