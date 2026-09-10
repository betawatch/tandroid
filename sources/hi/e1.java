package hi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ e1(k1 k1Var, int i10) {
        this.a = i10;
        this.b = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k1 k1Var = this.b;
                n4 n4Var = k1Var.R;
                if (n4Var != null && k1Var.d != null) {
                    k1Var.S = true;
                    n4Var.b().setPressed(false);
                    try {
                        k1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((w2) k1Var.d).a(k1Var, k1Var.R, true);
                    break;
                }
                break;
            case 1:
                this.b.n();
                break;
            default:
                this.b.s();
                break;
        }
    }
}
