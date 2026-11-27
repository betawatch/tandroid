// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class n2 implements Runnable {
    public final u2 a;
    public final x76 b;

    public n2(u2 u2Var, x76 x76Var) {
        this.a = u2Var;
        this.b = x76Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a == this) {
            if (u2.f.b(this.a, this, u2.i(this.b))) {
                u2.f(this.a, false);
            }
        }
    }
}
