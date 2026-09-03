package dg;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ b4.e0 c;

    public /* synthetic */ z0(c1 c1Var, b4.e0 e0Var, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                c1 c1Var = this.b;
                c1Var.f.f(new z0(c1Var, this.c, 0));
                break;
        }
    }
}
