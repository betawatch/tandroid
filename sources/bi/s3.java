package bi;

import org.telegram.messenger.beta.R;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                org.telegram.ui.Components.bc I = org.telegram.ui.Components.gc.a0(cnVar).I(R.raw.forward, org.telegram.messenger.id.M0(2131749897, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749898, k7Var.y1(), org.telegram.messenger.m5.t(j3))));
                I.t = true;
                I.j();
                break;
            default:
                org.telegram.ui.Components.bc I2 = org.telegram.ui.Components.gc.a0(cnVar).I(R.raw.forward, org.telegram.messenger.id.M0(2131749897, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749898, k7Var.y1(), org.telegram.messenger.m5.t(j3))));
                I2.t = true;
                I2.j();
                break;
        }
    }
}
