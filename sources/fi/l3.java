package fi;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
