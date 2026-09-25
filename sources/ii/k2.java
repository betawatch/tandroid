package ii;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ k2(x3 x3Var, int i10, int i11) {
        this.a = i11;
        this.b = x3Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d4(this.c);
                break;
            case 1:
                this.b.f4(this.c);
                break;
            case 2:
                this.b.scrollBy(0, this.c);
                break;
            default:
                this.b.e4(this.c);
                break;
        }
    }
}
