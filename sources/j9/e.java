package j9;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
