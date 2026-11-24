// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bc5 implements pq4, ee, qq7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc5 b;

    public /* synthetic */ bc5(oc5 oc5Var, byte b) {
        this.a = b;
        this.b = oc5Var;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        int i = gm.H0(wzcVar, false).d;
        oc5 oc5Var = this.b;
        oc5Var.n0 = i;
        ec0 ec0Var = oc5Var.G;
        if (ec0Var != null) {
            ec0Var.setPadding(0, 0, 0, i);
        }
        oc5Var.l0();
        oc5Var.j0();
        return wzc.b;
    }

    @Override // pq4
    public final void a(int i) {
        this.b.b.a(Math.min(i, r1.d0));
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        oc5 oc5Var = this.b;
        switch (b) {
            case 1:
                oc5Var.s0();
                break;
            default:
                oc5Var.finishFragment();
                break;
        }
    }
}
