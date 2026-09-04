package i9;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class c0 extends h {
    public final boolean o(w wVar) {
        b bVar;
        wVar.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (wVar.isDone()) {
                if (o.f.b(this, null, o.j(wVar))) {
                    o.g(this, false);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, wVar);
            if (o.f.b(this, null, eVar)) {
                try {
                    wVar.a(eVar, q.a);
                    return true;
                } catch (Throwable th2) {
                    try {
                        bVar = new b(th2);
                    } catch (Error | Exception unused) {
                        bVar = b.b;
                    }
                    o.f.b(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.a;
        }
        if (obj instanceof a) {
            wVar.cancel(((a) obj).a);
        }
        return false;
    }
}
