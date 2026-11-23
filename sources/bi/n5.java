package bi;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ n5(m6 m6Var, int i7, int i10) {
        this.a = i10;
        this.b = m6Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                f6 f6Var = this.b.f;
                if (f6Var != null) {
                    f6Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
