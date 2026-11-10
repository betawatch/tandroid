package ee;

import c8.u0;
import zd.b0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        a.h(u0.b(this.d), b0.s(obj));
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
