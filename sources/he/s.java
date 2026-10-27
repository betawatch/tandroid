package he;

import a8.pe;
import ce.f0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class s extends ce.a implements nd.d {
    public final ld.c d;

    public s(ld.c cVar, ld.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // ce.v1
    public void b(Object obj) {
        a.g(f0.r(obj), pe.b(this.d));
    }

    @Override // ce.v1
    public void g(Object obj) {
        this.d.resumeWith(f0.r(obj));
    }

    @Override // nd.d
    public final nd.d getCallerFrame() {
        ld.c cVar = this.d;
        if (cVar instanceof nd.d) {
            return (nd.d) cVar;
        }
        return null;
    }

    @Override // ce.v1
    public final boolean z() {
        return true;
    }
}
