package ai;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ o3(o4 o4Var, int i3, int i10) {
        this.a = i10;
        this.b = o4Var;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                h4 h4Var = this.b.f;
                if (h4Var != null) {
                    h4Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
