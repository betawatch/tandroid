package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t6 b;

    public /* synthetic */ p6(t6 t6Var, int i10) {
        this.a = i10;
        this.b = t6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                t6 t6Var = this.b;
                t6Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(jr.h).setDuration(280L).start();
                t6Var.c = System.currentTimeMillis();
                t6Var.invalidate();
                try {
                    t6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(t6Var.h, 59500L);
                break;
        }
    }
}
