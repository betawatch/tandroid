package hi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ s9(nb nbVar, Runnable runnable, int i7) {
        this.a = i7;
        this.b = nbVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.run();
                this.b.o0();
                break;
            default:
                nb nbVar = this.b;
                nbVar.e(false);
                org.telegram.messenger.g0.r(nbVar.h2);
                nbVar.h2 = null;
                nbVar.T1 = false;
                this.c.run();
                break;
        }
    }
}
