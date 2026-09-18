package m4;

import ai.g3;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                this.b.g.N0(this.c, TLObject.FLAG_31, 7, g1.P0(new ai.i(9)));
                break;
            case 2:
                this.b.g.N0(this.c, TLObject.FLAG_31, 12, g1.P0(new ai.i(11)));
                break;
            case 3:
                this.b.g.N0(this.c, TLObject.FLAG_31, 11, g1.P0(new ai.i(8)));
                break;
            case 4:
                this.b.g.N0(this.c, TLObject.FLAG_31, 3, g1.P0(new ai.i(14)));
                break;
            case 5:
                this.b.g.N0(this.c, TLObject.FLAG_31, 1, g1.P0(new ai.i(5)));
                break;
            case 6:
                g1 g1Var = this.b.g;
                g1Var.getClass();
                r rVar2 = this.c;
                g1Var.N0(rVar2, TLObject.FLAG_31, 1, g1.P0(new g3(2, g1Var, rVar2)));
                break;
            case 7:
                g1 g1Var2 = this.b.g;
                g1Var2.getClass();
                r rVar3 = this.c;
                g1Var2.N0(rVar3, TLObject.FLAG_31, 1, g1.P0(new g3(2, g1Var2, rVar3)));
                break;
            case 8:
                this.b.g.N0(this.c, TLObject.FLAG_31, 1, g1.P0(new ai.i(5)));
                break;
            default:
                this.b.g.N0(this.c, TLObject.FLAG_31, 9, g1.P0(new ai.i(12)));
                break;
        }
    }
}
