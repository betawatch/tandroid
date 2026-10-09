package ci;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                lcVar.f(1.0f, true, new ha(lcVar, 6));
                lcVar.b1.b(true, true);
                break;
            default:
                lc lcVar2 = this.b;
                lcVar2.e(false);
                lcVar2.m2 = null;
                break;
        }
    }
}
