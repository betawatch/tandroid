// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
