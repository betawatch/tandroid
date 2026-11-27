// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lsa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;
    public final /* synthetic */ zu1 c;
    public final /* synthetic */ long d;

    public /* synthetic */ lsa(wua wuaVar, zu1 zu1Var, long j, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = zu1Var;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        zu1 zu1Var = this.c;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                v21 I = d31.b0(zu1Var).I(R.raw.forward, ob6.M0(2131749843, null), hl.S2(ob6.a0(null, null, 2131749844, wuaVar.t1(), wf3.s(j))));
                I.u = true;
                I.j();
                break;
            default:
                v21 I2 = d31.b0(zu1Var).I(R.raw.forward, ob6.M0(2131749843, null), hl.S2(ob6.a0(null, null, 2131749844, wuaVar.t1(), wf3.s(j))));
                I2.u = true;
                I2.j();
                break;
        }
    }
}
