// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class cpc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uqc b;

    public /* synthetic */ cpc(uqc uqcVar, byte b) {
        this.a = b;
        this.b = uqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x25 x25Var;
        x25 x25Var2;
        byte b = this.a;
        uqc uqcVar = this.b;
        switch (b) {
            case 0:
                wsc wscVar = uqcVar.k0;
                if (wscVar != null && (x25Var = uqcVar.H0) != null) {
                    wscVar.Y(x25Var);
                }
                x25 x25Var3 = uqcVar.H0;
                boolean z = (x25Var3 == null || x25Var3.a.isEmpty()) ? false : true;
                if (uqcVar.g0 != z) {
                    uqcVar.O0(z);
                }
                if (z && uqcVar.I0) {
                    ltc ltcVar = uqcVar.j0;
                    if (ltcVar != null) {
                        ltcVar.b(false);
                    }
                    if (uqcVar.g0) {
                        uqcVar.I0 = false;
                        uqcVar.f0 = 1;
                        ir1 ir1Var = uqcVar.s0;
                        if (ir1Var != null) {
                            ir1Var.setPosition(1);
                        }
                    } else {
                        uqcVar.I0 = true;
                    }
                }
                wa waVar = uqcVar.a;
                if (waVar != null && waVar.g3 != null) {
                    uqcVar.b1(true);
                    break;
                }
                break;
            case 1:
                uqcVar.h0(false);
                break;
            case 2:
                uqcVar.G0();
                break;
            case 3:
                q9c q9cVar = uqcVar.u0[1];
                if (uqcVar.f0 == 1 && q9cVar != null && q9cVar.H && (x25Var2 = uqcVar.H0) != null && !x25Var2.i && !x25Var2.g && x25Var2.m == null && q9cVar.f3.M0() >= q9cVar.g3.E.size() - 3) {
                    uqcVar.H0.e();
                    break;
                }
                break;
            case 4:
                if (uqcVar.S.isAttachedToWindow()) {
                    if (!uqcVar.a.canScrollVertically(-1)) {
                        uqcVar.a.f3.g1(0, 0);
                    }
                    uqcVar.S.requestLayout();
                    break;
                }
                break;
            case 5:
                uqcVar.i0();
                break;
            case 6:
                uqcVar.X0();
                break;
            case 7:
                uqcVar.Q0 = null;
                break;
            case 8:
                uqcVar.S.post(new cpc(uqcVar, (byte) 4));
                break;
            case 9:
                d31.b0(uqcVar).N(ob6.M0(2131745589, null), ob6.M0(2131751070, null)).j();
                break;
            case 10:
                uqcVar.z0();
                break;
            case 11:
                uqcVar.presentFragment(new gtc());
                break;
            default:
                uqcVar.presentFragment(new thb());
                break;
        }
    }
}
