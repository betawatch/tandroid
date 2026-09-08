package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                q7Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(pr.h).setDuration(280L).start();
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
