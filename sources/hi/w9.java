package hi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class w9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ w9(nb nbVar, boolean z10, int i7) {
        this.a = i7;
        this.b = nbVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                nb nbVar = this.b;
                if (!this.c) {
                    nbVar.K0.b(false, false);
                    break;
                } else {
                    nbVar.getClass();
                    break;
                }
            default:
                nb nbVar2 = this.b;
                nbVar2.S = null;
                nbVar2.e = false;
                nbVar2.p(this.c);
                break;
        }
    }
}
