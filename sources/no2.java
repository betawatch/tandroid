// default package

import android.os.Bundle;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class no2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xo2 b;

    public /* synthetic */ no2(xo2 xo2Var, byte b) {
        this.a = b;
        this.b = xo2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xo2 xo2Var = this.b;
        switch (b) {
            case 0:
                xo2Var.u1.d.f3.g1(1, xo2Var.O1.b);
                xo2Var.l1.a(false, true);
                xo2Var.r0 = true;
                rq4 rq4Var = xo2Var.x1;
                hl.t1(rq4Var.r);
                rq4Var.r.clearFocus();
                break;
            case 1:
                xo2Var.w1.d.f3.g1(1, xo2Var.O1.b);
                xo2Var.m1.a(false, true);
                xo2Var.r0 = true;
                rq4 rq4Var2 = xo2Var.y1;
                hl.t1(rq4Var2.r);
                rq4Var2.r.clearFocus();
                break;
            default:
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", xo2Var.o1);
                xo2Var.t1.presentFragment(new xn2(bundle));
                xo2Var.dismiss();
                break;
        }
    }
}
