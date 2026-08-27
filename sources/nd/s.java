package nd;

import h7.h7;
import id.f0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class s extends id.a implements tc.d {
    public final rc.c d;

    public s(rc.c cVar, rc.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // id.v1
    public void f(Object obj) {
        a.g(f0.r(obj), h7.b(this.d));
    }

    @Override // id.v1
    public void g(Object obj) {
        this.d.resumeWith(f0.r(obj));
    }

    @Override // tc.d
    public final tc.d getCallerFrame() {
        rc.c cVar = this.d;
        if (cVar instanceof tc.d) {
            return (tc.d) cVar;
        }
        return null;
    }

    @Override // id.v1
    public final boolean z() {
        return true;
    }
}
