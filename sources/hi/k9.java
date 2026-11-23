package hi;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class k9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ k9(sa saVar, int i7) {
        this.a = i7;
        this.b = saVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sa saVar = this.b;
                saVar.getClass();
                saVar.f(1.0f, true, new r8(saVar, 6));
                saVar.c1.b(true, true);
                break;
            default:
                sa saVar2 = this.b;
                saVar2.e(false);
                saVar2.n2 = null;
                break;
        }
    }
}
