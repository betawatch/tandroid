package ci;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
