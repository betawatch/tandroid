package bi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d3(c4 c4Var, int i7, int i10) {
        this.a = i10;
        this.b = c4Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                v3 v3Var = this.b.f;
                if (v3Var != null) {
                    v3Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
