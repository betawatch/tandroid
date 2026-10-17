package m4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ v c;

    public /* synthetic */ e(f0 f0Var, v vVar, int i10) {
        this.a = i10;
        this.b = f0Var;
        this.c = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                if (!f0Var.j()) {
                    if (f0Var.x) {
                        v vVar = this.c;
                        if (!f0.k(vVar)) {
                            if (f0Var.i(vVar)) {
                                f0Var.x = false;
                            }
                        }
                    }
                    f0Var.e.getClass();
                    break;
                }
                break;
            case 1:
                this.b.g.O0(this.c, TLObject.FLAG_31, 1, i1.Q0(new k2.f0(15)));
                break;
            case 2:
                this.b.g.O0(this.c, TLObject.FLAG_31, 9, i1.Q0(new k2.f0(24)));
                break;
            case 3:
                this.b.g.O0(this.c, TLObject.FLAG_31, 7, i1.Q0(new k2.f0(20)));
                break;
            case 4:
                this.b.g.O0(this.c, TLObject.FLAG_31, 12, i1.Q0(new k2.f0(23)));
                break;
            case 5:
                this.b.g.O0(this.c, TLObject.FLAG_31, 11, i1.Q0(new k2.f0(19)));
                break;
            case 6:
                this.b.g.O0(this.c, TLObject.FLAG_31, 3, i1.Q0(new v0(0)));
                break;
            case 7:
                this.b.g.O0(this.c, TLObject.FLAG_31, 1, i1.Q0(new k2.f0(15)));
                break;
            case 8:
                this.b.g.M0(this.c, TLObject.FLAG_31);
                break;
            default:
                this.b.g.M0(this.c, TLObject.FLAG_31);
                break;
        }
    }
}
