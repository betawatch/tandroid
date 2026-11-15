package di;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ an c;
    public final /* synthetic */ long d;

    public /* synthetic */ y2(c6 c6Var, an anVar, long j3, int i7) {
        this.a = i7;
        this.b = c6Var;
        this.c = anVar;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.d;
        an anVar = this.c;
        c6 c6Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0(anVar).I(R.raw.forward, hd.M0(2131749897, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749898, c6Var.z1(), org.telegram.messenger.m5.t(j3))));
                I.t = true;
                I.j();
                break;
            default:
                org.telegram.ui.Components.xb I2 = org.telegram.ui.Components.cc.a0(anVar).I(R.raw.forward, hd.M0(2131749897, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749898, c6Var.z1(), org.telegram.messenger.m5.t(j3))));
                I2.t = true;
                I2.j();
                break;
        }
    }
}
