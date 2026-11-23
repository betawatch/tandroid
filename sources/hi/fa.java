package hi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class fa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb b;

    public /* synthetic */ fa(nb nbVar, int i7) {
        this.a = i7;
        this.b = nbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nb nbVar = this.b;
                nbVar.getClass();
                nbVar.f(1.0f, true, new m9(nbVar, 6));
                nbVar.c1.b(true, true);
                break;
            default:
                nb nbVar2 = this.b;
                nbVar2.e(false);
                nbVar2.n2 = null;
                break;
        }
    }
}
