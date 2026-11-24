// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class jt2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tx6 b;
    public final /* synthetic */ sw6 c;

    public /* synthetic */ jt2(tx6 tx6Var, sw6 sw6Var, byte b) {
        this.a = b;
        this.b = tx6Var;
        this.c = sw6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 17;
        sw6 sw6Var = this.c;
        tx6 tx6Var = this.b;
        switch (b) {
            case 0:
                if (!tx6Var.i()) {
                    if (tx6Var.x) {
                        if (!tx6.j(sw6Var)) {
                            if (tx6Var.h(sw6Var)) {
                                tx6Var.x = false;
                            }
                        }
                    }
                    tx6Var.e.getClass();
                    break;
                }
                break;
            case 1:
                tx6Var.g.S(sw6Var, TLObject.FLAG_31, 1, oz6.X(new yy6(b2)));
                break;
            case 2:
                tx6Var.g.S(sw6Var, TLObject.FLAG_31, 9, oz6.X(new yy6((byte) 22)));
                break;
            case 3:
                tx6Var.g.S(sw6Var, TLObject.FLAG_31, 7, oz6.X(new yy6((byte) 19)));
                break;
            case 4:
                tx6Var.g.S(sw6Var, TLObject.FLAG_31, 12, oz6.X(new yy6((byte) 21)));
                break;
            case 5:
                tx6Var.g.S(sw6Var, TLObject.FLAG_31, 11, oz6.X(new yy6((byte) 18)));
                break;
            case 6:
                tx6Var.g.S(sw6Var, TLObject.FLAG_31, 3, oz6.X(new yy6((byte) 23)));
                break;
            case 7:
                tx6Var.g.S(sw6Var, TLObject.FLAG_31, 1, oz6.X(new yy6(b2)));
                break;
            case 8:
                tx6Var.g.Q(sw6Var, TLObject.FLAG_31);
                break;
            default:
                tx6Var.g.Q(sw6Var, TLObject.FLAG_31);
                break;
        }
    }
}
