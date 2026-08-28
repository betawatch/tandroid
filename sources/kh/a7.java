package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7 b;

    public /* synthetic */ a7(e7 e7Var, int i9) {
        this.a = i9;
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
                e7Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(gr.h).setDuration(280L).start();
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
