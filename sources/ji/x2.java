package ji;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;
    public final /* synthetic */ s4.m0 c;

    public /* synthetic */ x2(v3 v3Var, s4.m0 m0Var, int i10) {
        this.a = i10;
        this.b = v3Var;
        this.c = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.setItemAnimator(this.c);
                break;
            default:
                this.b.setItemAnimator(this.c);
                break;
        }
    }
}
