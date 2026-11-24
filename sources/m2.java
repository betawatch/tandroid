// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m2 implements Runnable {
    public final t2 a;
    public final t76 b;

    public m2(t2 t2Var, t76 t76Var) {
        this.a = t2Var;
        this.b = t76Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a == this) {
            if (t2.f.b(this.a, this, t2.i(this.b))) {
                t2.f(this.a, false);
            }
        }
    }
}
