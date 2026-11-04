package ai;

import ci.e9;
import ci.nb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7 b;

    public /* synthetic */ p6(d7 d7Var, int i3) {
        this.a = i3;
        this.b = d7Var;
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
                d7 d7Var = this.b;
                ci.l6 l6Var = new ci.l6(d7Var.getContext(), d7Var.R1, d7Var.S1, d7Var.J0, null);
                long j10 = d7Var.V1.id;
                String str = d7Var.Y1;
                l6Var.g3 = true;
                e9.y(l6Var.a, false).K(j10, new o1(7, l6Var, str));
                break;
            case 3:
                d7 d7Var2 = this.b;
                s0.g1(d7Var2.getContext(), d7Var2.V1, d7Var2.J0);
                break;
            case 4:
                d7 d7Var3 = this.b;
                new nb(d7Var3.getContext(), d7Var3.J0).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
