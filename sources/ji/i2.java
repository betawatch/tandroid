package ji;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ i2(v3 v3Var, int i10, int i11) {
        this.a = i11;
        this.b = v3Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c4(this.c);
                break;
            case 1:
                this.b.e4(this.c);
                break;
            case 2:
                this.b.scrollBy(0, this.c);
                break;
            default:
                this.b.d4(this.c);
                break;
        }
    }
}
