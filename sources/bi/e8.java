package bi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;

    public /* synthetic */ e8(l8 l8Var, int i7) {
        this.a = i7;
        this.b = l8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e1();
                break;
            default:
                l8 l8Var = this.b;
                l8Var.e2.O(true);
                org.telegram.messenger.g0.h3(new e8(l8Var, 0), 150L);
                break;
        }
    }
}
