package ci;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ab implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc b;

    public /* synthetic */ ab(lc lcVar, int i10) {
        this.a = i10;
        this.b = lcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lc lcVar = this.b;
                lcVar.getClass();
                lcVar.g(1.0f, true, new ha(lcVar, 6));
                lcVar.b1.b(true, true);
                break;
            default:
                lc lcVar2 = this.b;
                lcVar2.f(false);
                lcVar2.m2 = null;
                break;
        }
    }
}
