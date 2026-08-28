package md;

import g7.g7;
import hd.f0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class s extends hd.a implements sc.d {
    public final qc.c d;

    public s(qc.c cVar, qc.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // hd.v1
    public void f(Object obj) {
        a.g(f0.r(obj), g7.b(this.d));
    }

    @Override // hd.v1
    public void g(Object obj) {
        this.d.resumeWith(f0.r(obj));
    }

    @Override // sc.d
    public final sc.d getCallerFrame() {
        qc.c cVar = this.d;
        if (cVar instanceof sc.d) {
            return (sc.d) cVar;
        }
        return null;
    }

    @Override // hd.v1
    public final boolean z() {
        return true;
    }
}
