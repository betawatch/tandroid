package bi;

import di.gb;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c9 b;

    public /* synthetic */ q8(c9 c9Var, int i7) {
        this.a = i7;
        this.b = c9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g1(false);
                break;
            case 1:
                this.b.g1(true);
                break;
            case 2:
                c9 c9Var = this.b;
                di.f6 f6Var = new di.f6(c9Var.getContext(), c9Var.U1, c9Var.V1, c9Var.J0, null);
                long j3 = c9Var.Y1.id;
                String str = c9Var.b2;
                f6Var.m3 = true;
                di.y8.y(f6Var.a, false).K(j3, new ai.y1(9, f6Var, str));
                break;
            case 3:
                c9 c9Var2 = this.b;
                m0.h1(c9Var2.getContext(), c9Var2.Y1, c9Var2.J0);
                break;
            case 4:
                c9 c9Var3 = this.b;
                new gb(c9Var3.getContext(), c9Var3.J0).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
