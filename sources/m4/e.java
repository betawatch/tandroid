package m4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ v c;

    public /* synthetic */ e(e0 e0Var, v vVar, int i10) {
        this.a = i10;
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
                this.b.g.O0(this.c, TLObject.FLAG_31, 1, i1.Q0(new k2.y0(15)));
                break;
            case 2:
                this.b.g.O0(this.c, TLObject.FLAG_31, 9, i1.Q0(new k2.y0(24)));
                break;
            case 3:
                this.b.g.O0(this.c, TLObject.FLAG_31, 7, i1.Q0(new k2.y0(20)));
                break;
            case 4:
                this.b.g.O0(this.c, TLObject.FLAG_31, 12, i1.Q0(new k2.y0(23)));
                break;
            case 5:
                this.b.g.O0(this.c, TLObject.FLAG_31, 11, i1.Q0(new k2.y0(19)));
                break;
            case 6:
                this.b.g.O0(this.c, TLObject.FLAG_31, 3, i1.Q0(new v0(0)));
                break;
            case 7:
                this.b.g.O0(this.c, TLObject.FLAG_31, 1, i1.Q0(new k2.y0(15)));
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
