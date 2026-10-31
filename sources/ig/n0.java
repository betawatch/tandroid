package ig;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ a5.a c;

    public /* synthetic */ n0(q0 q0Var, a5.a aVar, int i10) {
        this.a = i10;
        this.b = q0Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                q0 q0Var = this.b;
                q0Var.f.f(new n0(q0Var, this.c, 0));
                break;
        }
    }
}
