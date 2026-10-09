package m4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;
    public final /* synthetic */ r c;

    public /* synthetic */ b(b0 b0Var, r rVar, int i10) {
        this.a = i10;
        this.b = b0Var;
        this.c = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b0 b0Var = this.b;
                if (!b0Var.j()) {
                    if (b0Var.x) {
                        r rVar = this.c;
                        if (!b0.k(rVar)) {
                            if (b0Var.i(rVar)) {
                                b0Var.x = false;
                            }
                        }
                    }
                    b0Var.e.getClass();
                    break;
                }
                break;
            case 1:
                this.b.g.M0(this.c, TLObject.FLAG_31, 7, b1.O0(new j2.e(27)));
                break;
            case 2:
                this.b.g.M0(this.c, TLObject.FLAG_31, 12, b1.O0(new q0(0)));
                break;
            case 3:
                this.b.g.M0(this.c, TLObject.FLAG_31, 11, b1.O0(new j2.e(25)));
                break;
            case 4:
                this.b.g.M0(this.c, TLObject.FLAG_31, 3, b1.O0(new q0(7)));
                break;
            case 5:
                this.b.g.M0(this.c, TLObject.FLAG_31, 1, b1.O0(new j2.e(22)));
                break;
            case 6:
                b1 b1Var = this.b.g;
                b1Var.getClass();
                r rVar2 = this.c;
                b1Var.M0(rVar2, TLObject.FLAG_31, 1, b1.O0(new ah.b(27, b1Var, rVar2)));
                break;
            case 7:
                b1 b1Var2 = this.b.g;
                b1Var2.getClass();
                r rVar3 = this.c;
                b1Var2.M0(rVar3, TLObject.FLAG_31, 1, b1.O0(new ah.b(27, b1Var2, rVar3)));
                break;
            case 8:
                this.b.g.M0(this.c, TLObject.FLAG_31, 1, b1.O0(new j2.e(22)));
                break;
            default:
                this.b.g.M0(this.c, TLObject.FLAG_31, 9, b1.O0(new q0(1)));
                break;
        }
    }
}
