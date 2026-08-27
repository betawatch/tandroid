package gh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ r2(t3 t3Var, int i10, int i11) {
        this.a = i11;
        this.b = t3Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                n3 n3Var = this.b.f;
                if (n3Var != null) {
                    n3Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
