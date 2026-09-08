package m4;

import bi.t2;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                this.b.g.N0(this.c, TLObject.FLAG_31, 7, f1.P0(new bi.f(9)));
                break;
            case 2:
                this.b.g.N0(this.c, TLObject.FLAG_31, 12, f1.P0(new bi.f(11)));
                break;
            case 3:
                this.b.g.N0(this.c, TLObject.FLAG_31, 11, f1.P0(new bi.f(8)));
                break;
            case 4:
                this.b.g.N0(this.c, TLObject.FLAG_31, 3, f1.P0(new bi.f(14)));
                break;
            case 5:
                this.b.g.N0(this.c, TLObject.FLAG_31, 1, f1.P0(new bi.f(5)));
                break;
            case 6:
                f1 f1Var = this.b.g;
                f1Var.getClass();
                r rVar2 = this.c;
                f1Var.N0(rVar2, TLObject.FLAG_31, 1, f1.P0(new t2(2, f1Var, rVar2)));
                break;
            case 7:
                f1 f1Var2 = this.b.g;
                f1Var2.getClass();
                r rVar3 = this.c;
                f1Var2.N0(rVar3, TLObject.FLAG_31, 1, f1.P0(new t2(2, f1Var2, rVar3)));
                break;
            case 8:
                this.b.g.N0(this.c, TLObject.FLAG_31, 1, f1.P0(new bi.f(5)));
                break;
            default:
                this.b.g.N0(this.c, TLObject.FLAG_31, 9, f1.P0(new bi.f(12)));
                break;
        }
    }
}
