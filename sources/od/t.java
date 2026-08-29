package od;

import i7.v7;
import jd.e0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class t extends jd.a implements uc.d {
    public final sc.c d;

    public t(sc.c cVar, sc.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // jd.u1
    public void f(Object obj) {
        a.g(e0.r(obj), v7.b(this.d));
    }

    @Override // jd.u1
    public void g(Object obj) {
        this.d.resumeWith(e0.r(obj));
    }

    @Override // uc.d
    public final uc.d getCallerFrame() {
        sc.c cVar = this.d;
        if (cVar instanceof uc.d) {
            return (uc.d) cVar;
        }
        return null;
    }

    @Override // jd.u1
    public final boolean z() {
        return true;
    }
}
