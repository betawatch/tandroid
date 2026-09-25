package m4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;
    public final /* synthetic */ r c;

    public /* synthetic */ b(a0 a0Var, r rVar, int i10) {
        this.a = i10;
        this.b = a0Var;
        this.c = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                if (!a0Var.j()) {
                    if (a0Var.x) {
                        r rVar = this.c;
                        if (!a0.k(rVar)) {
                            if (a0Var.i(rVar)) {
                                a0Var.x = false;
                            }
                        }
                    }
                    a0Var.e.getClass();
                    break;
                }
                break;
            case 1:
                this.b.g.N0(this.c, TLObject.FLAG_31, 7, a1.P0(new o0(2)));
                break;
            case 2:
                this.b.g.N0(this.c, TLObject.FLAG_31, 12, a1.P0(new o0(5)));
                break;
            case 3:
                this.b.g.N0(this.c, TLObject.FLAG_31, 11, a1.P0(new o0(0)));
                break;
            case 4:
                this.b.g.N0(this.c, TLObject.FLAG_31, 3, a1.P0(new o0(12)));
                break;
            case 5:
                this.b.g.N0(this.c, TLObject.FLAG_31, 1, a1.P0(new j2.e(27)));
                break;
            case 6:
                a1 a1Var = this.b.g;
                a1Var.getClass();
                r rVar2 = this.c;
                a1Var.N0(rVar2, TLObject.FLAG_31, 1, a1.P0(new ah.b(27, a1Var, rVar2)));
                break;
            case 7:
                a1 a1Var2 = this.b.g;
                a1Var2.getClass();
                r rVar3 = this.c;
                a1Var2.N0(rVar3, TLObject.FLAG_31, 1, a1.P0(new ah.b(27, a1Var2, rVar3)));
                break;
            case 8:
                this.b.g.N0(this.c, TLObject.FLAG_31, 1, a1.P0(new j2.e(27)));
                break;
            default:
                this.b.g.N0(this.c, TLObject.FLAG_31, 9, a1.P0(new o0(6)));
                break;
        }
    }
}
