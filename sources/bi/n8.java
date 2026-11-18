package bi;

import di.gb;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z8 b;

    public /* synthetic */ n8(z8 z8Var, int i7) {
        this.a = i7;
        this.b = z8Var;
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
                z8 z8Var = this.b;
                di.f6 f6Var = new di.f6(z8Var.getContext(), z8Var.U1, z8Var.V1, z8Var.J0, null);
                long j3 = z8Var.Y1.id;
                String str = z8Var.b2;
                f6Var.m3 = true;
                di.x8.y(f6Var.a, false).K(j3, new ai.v1(9, f6Var, str));
                break;
            case 3:
                z8 z8Var2 = this.b;
                m0.h1(z8Var2.getContext(), z8Var2.Y1, z8Var2.J0);
                break;
            case 4:
                z8 z8Var3 = this.b;
                new gb(z8Var3.getContext(), z8Var3.J0).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
