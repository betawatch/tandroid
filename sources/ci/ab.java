package ci;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
