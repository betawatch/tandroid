package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b7 b;

    public /* synthetic */ x6(b7 b7Var, int i10) {
        this.a = i10;
        this.b = b7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                b7 b7Var = this.b;
                b7Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(ds.h).setDuration(280L).start();
                b7Var.c = System.currentTimeMillis();
                b7Var.invalidate();
                try {
                    b7Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(b7Var.h, 59500L);
                break;
        }
    }
}
