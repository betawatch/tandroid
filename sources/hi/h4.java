package hi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;
    public final /* synthetic */ tg.w1 c;

    public /* synthetic */ h4(v5 v5Var, tg.w1 w1Var, int i7) {
        this.a = i7;
        this.b = v5Var;
        this.c = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.D0(this.c, true);
                break;
            default:
                this.b.B0(this.c);
                break;
        }
    }
}
