package di;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ bn c;
    public final /* synthetic */ long d;

    public /* synthetic */ b3(f6 f6Var, bn bnVar, long j3, int i7) {
        this.a = i7;
        this.b = f6Var;
        this.c = bnVar;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.d;
        bn bnVar = this.c;
        f6 f6Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(bnVar).I(R.raw.forward, hd.N0(2131749880, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749881, f6Var.E1(), org.telegram.messenger.n5.t(j3))));
                I.t = true;
                I.j();
                break;
            default:
                org.telegram.ui.Components.gc I2 = org.telegram.ui.Components.lc.b0(bnVar).I(R.raw.forward, hd.N0(2131749880, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749881, f6Var.E1(), org.telegram.messenger.n5.t(j3))));
                I2.t = true;
                I2.j();
                break;
        }
    }
}
