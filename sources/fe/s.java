package fe;

import ae.g0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class s extends ae.a implements ld.d {
    public final jd.c d;

    public s(jd.c cVar, jd.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // ae.w1
    public void f(Object obj) {
        a.g(g0.r(obj), w7.h.b(this.d));
    }

    @Override // ae.w1
    public void g(Object obj) {
        this.d.resumeWith(g0.r(obj));
    }

    @Override // ld.d
    public final ld.d getCallerFrame() {
        jd.c cVar = this.d;
        if (cVar instanceof ld.d) {
            return (ld.d) cVar;
        }
        return null;
    }

    @Override // ae.w1
    public final boolean z() {
        return true;
    }
}
