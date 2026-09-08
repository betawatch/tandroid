package ji;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ o2(v3 v3Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = v3Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.X1(this.c, this.d);
                break;
            default:
                this.b.f4(this.c, this.d);
                break;
        }
    }
}
