package o4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ v c;

    public /* synthetic */ e(e0 e0Var, v vVar, int i3) {
        this.a = i3;
        this.b = e0Var;
        this.c = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                if (!e0Var.j()) {
                    if (e0Var.x) {
                        v vVar = this.c;
                        if (!e0.k(vVar)) {
                            if (e0Var.i(vVar)) {
                                e0Var.x = false;
                            }
                        }
                    }
                    e0Var.e.getClass();
                    break;
                }
                break;
            case 1:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 1, h1.S0(new n9.j(8)));
                break;
            case 2:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 9, h1.S0(new n9.j(17)));
                break;
            case 3:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 7, h1.S0(new n9.j(13)));
                break;
            case 4:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 12, h1.S0(new n9.j(16)));
                break;
            case 5:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 11, h1.S0(new n9.j(12)));
                break;
            case 6:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 3, h1.S0(new n9.j(23)));
                break;
            case 7:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 1, h1.S0(new n9.j(8)));
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
