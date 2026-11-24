// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class koa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;
    public final /* synthetic */ mu1 c;
    public final /* synthetic */ long d;

    public /* synthetic */ koa(vqa vqaVar, mu1 mu1Var, long j, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = mu1Var;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        mu1 mu1Var = this.c;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                m21 I = u21.b0(mu1Var).I(R.raw.forward, k96.M0(2131749881, null), gl.T2(k96.a0(null, null, 2131749882, vqaVar.s1(), cf3.s(j))));
                I.t = true;
                I.j();
                break;
            default:
                m21 I2 = u21.b0(mu1Var).I(R.raw.forward, k96.M0(2131749881, null), gl.T2(k96.a0(null, null, 2131749882, vqaVar.s1(), cf3.s(j))));
                I2.t = true;
                I2.j();
                break;
        }
    }
}
