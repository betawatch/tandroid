package mg;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ h0(o0 o0Var, int i10) {
        this.a = i10;
        this.b = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new h0(this.b, 1));
                break;
            default:
                this.b.a(null);
                break;
        }
    }
}
