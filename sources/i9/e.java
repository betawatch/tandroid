package i9;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
