package ii;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ q2(x3 x3Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = x3Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Y1(this.c, this.d);
                break;
            default:
                this.b.g4(this.c, this.d);
                break;
        }
    }
}
