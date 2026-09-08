package fi;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class b5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;

    public /* synthetic */ b5(c5 c5Var, int i10) {
        this.a = i10;
        this.b = c5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c5 c5Var = this.b;
                if (c5Var.w) {
                    c5Var.d();
                    break;
                }
                break;
            default:
                this.b.invalidateSelf();
                break;
        }
    }
}
