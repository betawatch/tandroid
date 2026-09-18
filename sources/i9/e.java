package i9;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class e implements Runnable {
    public final c0 a;
    public final w b;

    public e(c0 c0Var, w wVar) {
        this.a = c0Var;
        this.b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (o.f.b(this.a, this, o.j(this.b))) {
            o.g(this.a, false);
        }
    }
}
