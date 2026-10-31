package ig;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;
    public final /* synthetic */ r0 c;

    public /* synthetic */ y(a0 a0Var, r0 r0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
        this.c = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new y(this.b, this.c, 1));
                break;
            default:
                a0 a0Var = this.b;
                a0Var.getClass();
                a0Var.i = this.c.a;
                break;
        }
    }
}
