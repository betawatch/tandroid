package ei;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5 b;

    public /* synthetic */ a5(b5 b5Var, int i10) {
        this.a = i10;
        this.b = b5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b5 b5Var = this.b;
                if (b5Var.w) {
                    b5Var.d();
                    break;
                }
                break;
            default:
                this.b.invalidateSelf();
                break;
        }
    }
}
