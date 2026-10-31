package bi;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ q2(d4 d4Var, int i10, int i11) {
        this.a = i11;
        this.b = d4Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g4(this.c);
                break;
            case 1:
                this.b.i4(this.c);
                break;
            case 2:
                this.b.scrollBy(0, this.c);
                break;
            default:
                this.b.h4(this.c);
                break;
        }
    }
}
