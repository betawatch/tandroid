package m4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                this.b.g.N0(this.c, TLObject.FLAG_31, 7, h1.P0(new gg.g0(7)));
                break;
            case 2:
                this.b.g.N0(this.c, TLObject.FLAG_31, 12, h1.P0(new gg.g0(9)));
                break;
            case 3:
                this.b.g.N0(this.c, TLObject.FLAG_31, 11, h1.P0(new gg.g0(6)));
                break;
            case 4:
                this.b.g.N0(this.c, TLObject.FLAG_31, 3, h1.P0(new gg.g0(12)));
                break;
            case 5:
                this.b.g.N0(this.c, TLObject.FLAG_31, 1, h1.P0(new gg.g0(3)));
                break;
            case 6:
                h1 h1Var = this.b.g;
                h1Var.getClass();
                r rVar2 = this.c;
                h1Var.N0(rVar2, TLObject.FLAG_31, 1, h1.P0(new q0(1, h1Var, rVar2)));
                break;
            case 7:
                h1 h1Var2 = this.b.g;
                h1Var2.getClass();
                r rVar3 = this.c;
                h1Var2.N0(rVar3, TLObject.FLAG_31, 1, h1.P0(new q0(1, h1Var2, rVar3)));
                break;
            case 8:
                this.b.g.N0(this.c, TLObject.FLAG_31, 1, h1.P0(new gg.g0(3)));
                break;
            default:
                this.b.g.N0(this.c, TLObject.FLAG_31, 9, h1.P0(new gg.g0(10)));
                break;
        }
    }
}
