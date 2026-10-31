package bi;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ w2(d4 d4Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = d4Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b2(this.c, this.d);
                break;
            default:
                this.b.j4(this.c, this.d);
                break;
        }
    }
}
