package bi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ q5(p6 p6Var, int i7, int i10) {
        this.a = i10;
        this.b = p6Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                i6 i6Var = this.b.f;
                if (i6Var != null) {
                    i6Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
