package bi;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;

    public /* synthetic */ o3(s3 s3Var, int i7) {
        this.a = i7;
        this.b = s3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s3 s3Var = this.b;
                if (s3Var.l2) {
                    s3Var.l2 = false;
                    s3Var.d2.setLoading(false);
                    s3Var.g1();
                    break;
                }
                break;
            case 1:
                s3 s3Var2 = this.b;
                if (!s3Var2.j2) {
                    s3Var2.j2 = true;
                    s3Var2.i2 = false;
                    s3Var2.h2 = false;
                    s3Var2.dismiss();
                    Runnable runnable = s3Var2.r2;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                if (!s3Var2.k2) {
                    s3Var2.k2 = true;
                    ai.c1 c1Var = s3Var2.t2;
                    if (c1Var != null) {
                        c1Var.run();
                        break;
                    }
                }
                break;
            case 2:
                this.b.f1();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
