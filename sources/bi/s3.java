package bi;

import org.telegram.messenger.beta.R;
import org.telegram.ui.an;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ an c;
    public final /* synthetic */ long d;

    public /* synthetic */ s3(k7 k7Var, an anVar, long j3, int i7) {
        this.a = i7;
        this.b = k7Var;
        this.c = anVar;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.d;
        an anVar = this.c;
        k7 k7Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(anVar).I(R.raw.forward, org.telegram.messenger.id.M0(2131749898, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749899, k7Var.z1(), org.telegram.messenger.m5.t(j3))));
                I.t = true;
                I.j();
                break;
            default:
                org.telegram.ui.Components.cc I2 = org.telegram.ui.Components.hc.a0(anVar).I(R.raw.forward, org.telegram.messenger.id.M0(2131749898, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749899, k7Var.z1(), org.telegram.messenger.m5.t(j3))));
                I2.t = true;
                I2.j();
                break;
        }
    }
}
