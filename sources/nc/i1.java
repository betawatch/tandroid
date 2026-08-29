package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum i1 extends b2 {
    public i1() {
        super("AfterDoctypeName", 53);
    }

    @Override // nc.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        boolean j10 = aVar.j();
        w wVar = b2.a;
        if (j10) {
            lVar.l(this);
            fVar.getClass();
            lVar.j();
            lVar.c = wVar;
            return;
        }
        if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
            return;
        }
        if (aVar.m('>')) {
            lVar.j();
            lVar.a(wVar);
            return;
        }
        if (aVar.l("PUBLIC")) {
            fVar.getClass();
            lVar.c = b2.n0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            lVar.c = b2.t0;
        } else {
            lVar.m(this);
            fVar.getClass();
            lVar.a(b2.y0);
        }
    }
}
