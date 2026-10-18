package ge;

import be.f0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
