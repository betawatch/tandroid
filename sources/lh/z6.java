package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7 b;

    public /* synthetic */ z6(d7 d7Var, int i10) {
        this.a = i10;
        this.b = d7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                d7 d7Var = this.b;
                d7Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(er.h).setDuration(280L).start();
                d7Var.c = System.currentTimeMillis();
                d7Var.invalidate();
                try {
                    d7Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(d7Var.h, 59500L);
                break;
        }
    }
}
