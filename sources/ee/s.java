package ee;

import v7.t8;
import zd.e0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class s extends zd.a implements kd.d {
    public final id.c d;

    public s(id.c cVar, id.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // zd.u1
    public void f(Object obj) {
        a.g(e0.r(obj), t8.b(this.d));
    }

    @Override // zd.u1
    public void g(Object obj) {
        this.d.resumeWith(e0.r(obj));
    }

    @Override // kd.d
    public final kd.d getCallerFrame() {
        id.c cVar = this.d;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override // zd.u1
    public final boolean z() {
        return true;
    }
}
