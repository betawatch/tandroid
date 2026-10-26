package m4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                this.b.g.O0(this.c, TLObject.FLAG_31, 1, j1.Q0(new jh.l(16)));
                break;
            case 2:
                this.b.g.O0(this.c, TLObject.FLAG_31, 9, j1.Q0(new jh.l(25)));
                break;
            case 3:
                this.b.g.O0(this.c, TLObject.FLAG_31, 7, j1.Q0(new jh.l(21)));
                break;
            case 4:
                this.b.g.O0(this.c, TLObject.FLAG_31, 12, j1.Q0(new jh.l(24)));
                break;
            case 5:
                this.b.g.O0(this.c, TLObject.FLAG_31, 11, j1.Q0(new jh.l(20)));
                break;
            case 6:
                this.b.g.O0(this.c, TLObject.FLAG_31, 3, j1.Q0(new x0(1)));
                break;
            case 7:
                this.b.g.O0(this.c, TLObject.FLAG_31, 1, j1.Q0(new jh.l(16)));
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
