package ig;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ m0(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                q0Var.c = null;
                a4.l lVar = q0Var.a;
                if (lVar != null) {
                    lVar.u();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
