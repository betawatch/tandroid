package bi;

import di.gb;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a9 b;

    public /* synthetic */ o8(a9 a9Var, int i7) {
        this.a = i7;
        this.b = a9Var;
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
                a9 a9Var = this.b;
                di.f6 f6Var = new di.f6(a9Var.getContext(), a9Var.U1, a9Var.V1, a9Var.J0, null);
                long j3 = a9Var.Y1.id;
                String str = a9Var.b2;
                f6Var.m3 = true;
                di.x8.y(f6Var.a, false).K(j3, new ai.v1(9, f6Var, str));
                break;
            case 3:
                a9 a9Var2 = this.b;
                m0.h1(a9Var2.getContext(), a9Var2.Y1, a9Var2.J0);
                break;
            case 4:
                a9 a9Var3 = this.b;
                new gb(a9Var3.getContext(), a9Var3.J0).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
