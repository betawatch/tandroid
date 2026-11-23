package bi;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
