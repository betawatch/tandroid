package ai;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w1 b;

    public /* synthetic */ k1(w1 w1Var, int i7) {
        this.a = i7;
        this.b = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d(null);
                break;
            case 1:
                w1 w1Var = this.b;
                w1Var.g = true;
                w1Var.d(null);
                break;
            case 2:
                this.b.d(null);
                break;
            default:
                this.b.f(2, "I recorded it this morning on my way to the office.");
                break;
        }
    }
}
