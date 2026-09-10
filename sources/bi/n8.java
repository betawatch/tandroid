package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class n8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;

    public /* synthetic */ n8(r8 r8Var, int i10) {
        this.a = i10;
        this.b = r8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                r8 r8Var = this.b;
                r8Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(wr.h).setDuration(280L).start();
                r8Var.c = System.currentTimeMillis();
                r8Var.invalidate();
                try {
                    r8Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(r8Var.h, 59500L);
                break;
        }
    }
}
