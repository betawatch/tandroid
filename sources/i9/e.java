package i9;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
