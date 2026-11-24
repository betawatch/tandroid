// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lld implements Runnable {
    public final wqd a;
    public final bpd b;

    public lld(wqd wqdVar, bpd bpdVar) {
        this.a = wqdVar;
        this.b = bpdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a == this) {
            bpd bpdVar = this.b;
            if (cmd.h.f(this.a, this, wqd.h(bpdVar))) {
                wqd.j(this.a);
            }
        }
    }
}
