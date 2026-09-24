package ci;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ra implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ra(lc lcVar, boolean z10, int i10) {
        this.a = i10;
        this.b = lcVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f(this.c);
                break;
            case 1:
                lc lcVar = this.b;
                if (!this.c) {
                    lcVar.J0.b(false, false);
                    break;
                } else {
                    lcVar.getClass();
                    break;
                }
            default:
                lc lcVar2 = this.b;
                lcVar2.R = null;
                lcVar2.e = false;
                lcVar2.q(this.c);
                break;
        }
    }
}
