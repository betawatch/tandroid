package hi;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4 b;

    public /* synthetic */ m4(n4 n4Var, int i7) {
        this.a = i7;
        this.b = n4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n4 n4Var = this.b;
                if (n4Var.x) {
                    n4Var.d();
                    break;
                }
                break;
            default:
                this.b.invalidateSelf();
                break;
        }
    }
}
