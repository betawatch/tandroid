package bi;

import di.db;
import di.v8;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;

    public /* synthetic */ h6(u6 u6Var, int i7) {
        this.a = i7;
        this.b = u6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f1(false);
                break;
            case 1:
                this.b.f1(true);
                break;
            case 2:
                u6 u6Var = this.b;
                di.c6 c6Var = new di.c6(u6Var.getContext(), u6Var.U1, u6Var.V1, u6Var.J0, null);
                long j3 = u6Var.Y1.id;
                String str = u6Var.b2;
                c6Var.j3 = true;
                v8.y(c6Var.a, false).K(j3, new ai.u1(8, c6Var, str));
                break;
            case 3:
                u6 u6Var2 = this.b;
                m0.g1(u6Var2.getContext(), u6Var2.Y1, u6Var2.J0);
                break;
            case 4:
                u6 u6Var3 = this.b;
                new db(u6Var3.getContext(), u6Var3.J0).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
