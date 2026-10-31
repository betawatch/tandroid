package oh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ f(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            case 1:
                q.k(this.b.q, true, true);
                break;
            default:
                this.b.e();
                break;
        }
    }
}
