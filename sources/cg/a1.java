package cg;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ b4.e0 c;

    public /* synthetic */ a1(d1 d1Var, b4.e0 e0Var, int i10) {
        this.a = i10;
        this.b = d1Var;
        this.c = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                d1 d1Var = this.b;
                d1Var.f.f(new a1(d1Var, this.c, 0));
                break;
        }
    }
}
