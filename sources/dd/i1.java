package dd;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public enum i1 extends b2 {
    public i1() {
        super("AfterDoctypeName", 53);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        boolean j3 = aVar.j();
        w wVar = b2.a;
        if (j3) {
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
            lVar.c = b2.r0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            lVar.c = b2.x0;
        } else {
            lVar.m(this);
            fVar.getClass();
            lVar.a(b2.C0);
        }
    }
}
