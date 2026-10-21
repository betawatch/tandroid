package ge;

import be.f0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public class s extends be.a implements md.d {
    public final kd.c d;

    public s(kd.c cVar, kd.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // be.v1
    public void b(Object obj) {
        a.g(f0.r(obj), w7.n.b(this.d));
    }

    @Override // be.v1
    public void g(Object obj) {
        this.d.resumeWith(f0.r(obj));
    }

    @Override // md.d
    public final md.d getCallerFrame() {
        kd.c cVar = this.d;
        if (cVar instanceof md.d) {
            return (md.d) cVar;
        }
        return null;
    }

    @Override // be.v1
    public final boolean z() {
        return true;
    }
}
