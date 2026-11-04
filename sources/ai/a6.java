package ai;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h6 b;

    public /* synthetic */ a6(h6 h6Var, int i3) {
        this.a = i3;
        this.b = h6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d1();
                break;
            default:
                h6 h6Var = this.b;
                h6Var.b2.O(true);
                org.telegram.messenger.g0.i3(new a6(h6Var, 0), 150L);
                break;
        }
    }
}
