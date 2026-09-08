package di;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;
    public final /* synthetic */ rg.d2 c;

    public /* synthetic */ v4(q6 q6Var, rg.d2 d2Var, int i10) {
        this.a = i10;
        this.b = q6Var;
        this.c = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.D0(this.c, true);
                break;
            default:
                this.b.C0(this.c);
                break;
        }
    }
}
