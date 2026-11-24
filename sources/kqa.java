// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kqa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;
    public final /* synthetic */ yv1 c;
    public final /* synthetic */ long d;

    public /* synthetic */ kqa(wsa wsaVar, yv1 yv1Var, long j, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = yv1Var;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        yv1 yv1Var = this.c;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                u31 I = c41.b0(yv1Var).I(R.raw.forward, jb6.M0(2131749830, null), gm.S2(jb6.a0(null, null, 2131749831, wsaVar.s1(), pg3.s(j))));
                I.u = true;
                I.j();
                break;
            default:
                u31 I2 = c41.b0(yv1Var).I(R.raw.forward, jb6.M0(2131749830, null), gm.S2(jb6.a0(null, null, 2131749831, wsaVar.s1(), pg3.s(j))));
                I2.u = true;
                I2.j();
                break;
        }
    }
}
