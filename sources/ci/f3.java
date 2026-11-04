package ci;

import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;
    public final /* synthetic */ wm c;
    public final /* synthetic */ long d;

    public /* synthetic */ f3(l6 l6Var, wm wmVar, long j10, int i3) {
        this.a = i3;
        this.b = l6Var;
        this.c = wmVar;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        long j10 = this.d;
        wm wmVar = this.c;
        l6 l6Var = this.b;
        switch (i3) {
            case 0:
                org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(wmVar).I(R.raw.forward, bd.M0(2131749905, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749906, l6Var.z1(), org.telegram.messenger.m5.t(j10))));
                I.t = true;
                I.j();
                break;
            default:
                org.telegram.ui.Components.ac I2 = org.telegram.ui.Components.fc.a0(wmVar).I(R.raw.forward, bd.M0(2131749905, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749906, l6Var.z1(), org.telegram.messenger.m5.t(j10))));
                I2.t = true;
                I2.j();
                break;
        }
    }
}
