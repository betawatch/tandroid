// default package

import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pp2 b;

    public /* synthetic */ fp2(pp2 pp2Var, byte b) {
        this.a = b;
        this.b = pp2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pp2 pp2Var = this.b;
        switch (b) {
            case 0:
                pp2Var.u1.d.f3.g1(1, pp2Var.O1.b);
                pp2Var.l1.a(false, true);
                pp2Var.r0 = true;
                oq4 oq4Var = pp2Var.x1;
                gm.t1(oq4Var.r);
                oq4Var.r.clearFocus();
                break;
            case 1:
                pp2Var.w1.d.f3.g1(1, pp2Var.O1.b);
                pp2Var.m1.a(false, true);
                pp2Var.r0 = true;
                oq4 oq4Var2 = pp2Var.y1;
                gm.t1(oq4Var2.r);
                oq4Var2.r.clearFocus();
                break;
            default:
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", pp2Var.o1);
                pp2Var.t1.presentFragment(new po2(bundle));
                pp2Var.dismiss();
                break;
        }
    }
}
