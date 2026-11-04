package be;

import b8.jc;
import wd.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class q extends wd.a implements hd.d {
    public final fd.c d;

    public q(fd.c cVar, fd.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override // wd.n1
    public final boolean B() {
        return true;
    }

    @Override // wd.n1
    public void g(Object obj) {
        a.h(jc.b(this.d), b0.s(obj));
    }

    @Override // hd.d
    public final hd.d getCallerFrame() {
        fd.c cVar = this.d;
        if (cVar instanceof hd.d) {
            return (hd.d) cVar;
        }
        return null;
    }

    @Override // wd.n1
    public void h(Object obj) {
        this.d.resumeWith(b0.s(obj));
    }
}
