package ei;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
