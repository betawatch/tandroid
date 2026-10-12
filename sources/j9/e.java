package j9;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class e implements Runnable {
    public final o a;
    public final y b;

    public e(o oVar, y yVar) {
        this.a = oVar;
        this.b = yVar;
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
