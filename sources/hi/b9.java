package hi;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class b9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b9(sa saVar, boolean z10, int i7) {
        this.a = i7;
        this.b = saVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                sa saVar = this.b;
                if (!this.c) {
                    saVar.K0.b(false, false);
                    break;
                } else {
                    saVar.getClass();
                    break;
                }
            default:
                sa saVar2 = this.b;
                saVar2.S = null;
                saVar2.e = false;
                saVar2.p(this.c);
                break;
        }
    }
}
