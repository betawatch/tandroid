package m4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                this.b.g.O0(this.c, TLObject.FLAG_31, 1, j1.Q0(new k2.y0(15)));
                break;
            case 2:
                this.b.g.O0(this.c, TLObject.FLAG_31, 9, j1.Q0(new k2.y0(24)));
                break;
            case 3:
                this.b.g.O0(this.c, TLObject.FLAG_31, 7, j1.Q0(new k2.y0(20)));
                break;
            case 4:
                this.b.g.O0(this.c, TLObject.FLAG_31, 12, j1.Q0(new k2.y0(23)));
                break;
            case 5:
                this.b.g.O0(this.c, TLObject.FLAG_31, 11, j1.Q0(new k2.y0(19)));
                break;
            case 6:
                this.b.g.O0(this.c, TLObject.FLAG_31, 3, j1.Q0(new w0(0)));
                break;
            case 7:
                this.b.g.O0(this.c, TLObject.FLAG_31, 1, j1.Q0(new k2.y0(15)));
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
