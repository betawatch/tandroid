// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class fl1 implements hcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ fl1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // hcc
    public final Object run() {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                return zu1Var.getSimpleMenuOverlay();
            default:
                if (i86.e(65536) && hnb.c()) {
                    hnb hnbVar = zu1Var.y0;
                    if (hnbVar == null || hnbVar.e) {
                        if (zu1Var.getParentActivity() != null && hnb.c() && zu1Var.A0 != null && zu1Var.m1 != null) {
                            hnb hnbVar2 = zu1Var.y0;
                            if (hnbVar2 != null) {
                                hl.B2(hnbVar2);
                            }
                            hnb hnbVar3 = new hnb(zu1Var.getParentActivity(), new jj1(zu1Var, r1, (byte) 4));
                            zu1Var.y0 = hnbVar3;
                            hnb[] hnbVarArr = {hnbVar3};
                            nt1 nt1Var = zu1Var.m1;
                            nt1Var.addView(hnbVar3, nt1Var.indexOfChild(zu1Var.A0) + 1, tre.c(-1.0f, -1));
                        }
                    }
                    return zu1Var.y0;
                }
                return null;
        }
    }
}
