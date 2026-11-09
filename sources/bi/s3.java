package bi;

import org.telegram.messenger.beta.R;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ cn c;
    public final /* synthetic */ long d;

    public /* synthetic */ s3(k7 k7Var, cn cnVar, long j3, int i7) {
        this.a = i7;
        this.b = k7Var;
        this.c = cnVar;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.d;
        cn cnVar = this.c;
        k7 k7Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(cnVar).I(R.raw.forward, org.telegram.messenger.id.M0(2131749897, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749898, k7Var.y1(), org.telegram.messenger.m5.t(j3))));
                I.t = true;
                I.j();
                break;
            default:
                org.telegram.ui.Components.cc I2 = org.telegram.ui.Components.hc.a0(cnVar).I(R.raw.forward, org.telegram.messenger.id.M0(2131749897, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749898, k7Var.y1(), org.telegram.messenger.m5.t(j3))));
                I2.t = true;
                I2.j();
                break;
        }
    }
}
