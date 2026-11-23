package bi;

import di.gb;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f9 b;

    public /* synthetic */ t8(f9 f9Var, int i7) {
        this.a = i7;
        this.b = f9Var;
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
                f9 f9Var = this.b;
                di.f6 f6Var = new di.f6(f9Var.getContext(), f9Var.U1, f9Var.V1, f9Var.J0, null);
                long j3 = f9Var.Y1.id;
                String str = f9Var.b2;
                f6Var.m3 = true;
                di.y8.y(f6Var.a, false).K(j3, new ai.s1(9, f6Var, str));
                break;
            case 3:
                f9 f9Var2 = this.b;
                m0.h1(f9Var2.getContext(), f9Var2.Y1, f9Var2.J0);
                break;
            case 4:
                f9 f9Var3 = this.b;
                new gb(f9Var3.getContext(), f9Var3.J0).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
