package hi;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z4 b;

    public /* synthetic */ y4(z4 z4Var, int i10) {
        this.a = i10;
        this.b = z4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z4 z4Var = this.b;
                if (z4Var.w) {
                    z4Var.d();
                    break;
                }
                break;
            default:
                this.b.invalidateSelf();
                break;
        }
    }
}
