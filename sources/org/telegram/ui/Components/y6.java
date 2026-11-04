package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;
    public final /* synthetic */ f60 c;

    public /* synthetic */ y6(z7 z7Var, f60 f60Var, int i3) {
        this.a = i3;
        this.b = z7Var;
        this.c = f60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        f60 f60Var = this.c;
        z7 z7Var = this.b;
        switch (i3) {
            case 0:
                z7Var.getClass();
                f60Var.u();
                z7Var.P0(1);
                break;
            case 1:
                z7Var.getClass();
                f60Var.u();
                z7Var.P0(2);
                break;
            case 2:
                z7Var.getClass();
                f60Var.u();
                z7Var.P0(4);
                break;
            case 3:
                z7Var.getClass();
                f60Var.u();
                z7Var.P0(7);
                break;
            default:
                z7Var.U0(true);
                org.telegram.messenger.k5.o(null, 2131753912, new fc((FrameLayout) z7Var.b, z7Var.J0), R.raw.saved_messages, 36);
                f60Var.u();
                break;
        }
    }
}
