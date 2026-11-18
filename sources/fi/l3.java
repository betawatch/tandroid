package fi;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ l3(r3 r3Var, int i7) {
        this.a = i7;
        this.b = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((w8) this.b.x.A1).g(false);
                break;
            case 1:
                z3 z3Var = this.b.x;
                s3 s3Var = z3Var.A1;
                if (s3Var != null) {
                    f9 f9Var = ((w8) s3Var).d;
                    f9Var.Z0 = false;
                    f9Var.V();
                }
                z3Var.d1(false);
                z3Var.R2 = true;
                z3Var.u0.E(true);
                break;
            case 2:
                z3 z3Var2 = this.b.x;
                z3Var2.E3 = true;
                z3Var2.setActive(false);
                break;
            default:
                z3 z3Var3 = this.b.x;
                z3Var3.E3 = true;
                z3Var3.setActive(false);
                break;
        }
    }
}
