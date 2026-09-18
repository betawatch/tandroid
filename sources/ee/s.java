package ee;

import zd.e0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public class s extends zd.a implements kd.d {
    public final id.c d;

    public s(id.c cVar, id.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // zd.u1
    public void f(Object obj) {
        a.g(e0.r(obj), w7.g.b(this.d));
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
