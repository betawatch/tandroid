package m4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                this.b.g.N0(this.c, TLObject.FLAG_31, 7, b1.P0(new p0(0)));
                break;
            case 2:
                this.b.g.N0(this.c, TLObject.FLAG_31, 12, b1.P0(new p0(3)));
                break;
            case 3:
                this.b.g.N0(this.c, TLObject.FLAG_31, 11, b1.P0(new j2.e(28)));
                break;
            case 4:
                this.b.g.N0(this.c, TLObject.FLAG_31, 3, b1.P0(new p0(10)));
                break;
            case 5:
                this.b.g.N0(this.c, TLObject.FLAG_31, 1, b1.P0(new j2.e(25)));
                break;
            case 6:
                b1 b1Var = this.b.g;
                b1Var.getClass();
                r rVar2 = this.c;
                b1Var.N0(rVar2, TLObject.FLAG_31, 1, b1.P0(new ah.b(26, b1Var, rVar2)));
                break;
            case 7:
                b1 b1Var2 = this.b.g;
                b1Var2.getClass();
                r rVar3 = this.c;
                b1Var2.N0(rVar3, TLObject.FLAG_31, 1, b1.P0(new ah.b(26, b1Var2, rVar3)));
                break;
            case 8:
                this.b.g.N0(this.c, TLObject.FLAG_31, 1, b1.P0(new j2.e(25)));
                break;
            default:
                this.b.g.N0(this.c, TLObject.FLAG_31, 9, b1.P0(new p0(4)));
                break;
        }
    }
}
