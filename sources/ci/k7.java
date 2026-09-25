package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                o7Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(rr.h).setDuration(280L).start();
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
