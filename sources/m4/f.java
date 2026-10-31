package m4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ w c;

    public /* synthetic */ f(f0 f0Var, w wVar, int i10) {
        this.a = i10;
        this.b = f0Var;
        this.c = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                if (!f0Var.j()) {
                    if (f0Var.x) {
                        w wVar = this.c;
                        if (!f0.k(wVar)) {
                            if (f0Var.i(wVar)) {
                                f0Var.x = false;
                            }
                        }
                    }
                    f0Var.e.getClass();
                    break;
                }
                break;
            case 1:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 1, j1.S0(new k2.k0(18)));
                break;
            case 2:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 9, j1.S0(new k2.k0(27)));
                break;
            case 3:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 7, j1.S0(new k2.k0(23)));
                break;
            case 4:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 12, j1.S0(new k2.k0(26)));
                break;
            case 5:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 11, j1.S0(new k2.k0(22)));
                break;
            case 6:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 3, j1.S0(new v0(3)));
                break;
            case 7:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 1, j1.S0(new k2.k0(18)));
                break;
            case 8:
                this.b.g.O0(this.c, TLObject.FLAG_31);
                break;
            default:
                this.b.g.O0(this.c, TLObject.FLAG_31);
                break;
        }
    }
}
