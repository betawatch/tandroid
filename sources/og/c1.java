package og;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ c1(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f1 f1Var = this.b.b.d;
                if (f1Var != null) {
                    f1Var.postRunnable(f1Var.w);
                    break;
                }
                break;
            case 1:
                f1 f1Var2 = this.b.b.d;
                if (f1Var2 != null) {
                    f1Var2.postRunnable(f1Var2.w);
                    break;
                }
                break;
            default:
                h1 h1Var = this.b.b;
                f1 f1Var3 = h1Var.d;
                f1Var3.getClass();
                f1Var3.postRunnable(new e1(f1Var3, 2));
                h1Var.d = null;
                break;
        }
    }
}
