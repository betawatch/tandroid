package ee;

import c8.x0;
import zd.b0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class q extends zd.a implements kd.d {
    public final id.c d;

    public q(id.c cVar, id.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // zd.n1
    public final boolean B() {
        return true;
    }

    @Override // zd.n1
    public void g(Object obj) {
        a.h(x0.b(this.d), b0.s(obj));
    }

    @Override // kd.d
    public final kd.d getCallerFrame() {
        id.c cVar = this.d;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override // zd.n1
    public void h(Object obj) {
        this.d.resumeWith(b0.s(obj));
    }
}
