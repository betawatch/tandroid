package he;

import a8.pe;
import ce.f0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
