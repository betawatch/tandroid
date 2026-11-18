package bi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ l5(k6 k6Var, int i7, int i10) {
        this.a = i10;
        this.b = k6Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                d6 d6Var = this.b.f;
                if (d6Var != null) {
                    d6Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
