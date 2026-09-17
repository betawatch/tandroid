package dd;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public enum q1 extends b2 {
    public q1() {
        super("AfterDoctypeSystemKeyword", 60);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            lVar.c = b2.y0;
            return;
        }
        if (d == '\"') {
            lVar.m(this);
            lVar.c = b2.z0;
            return;
        }
        if (d == '\'') {
            lVar.m(this);
            lVar.c = b2.A0;
            return;
        }
        w wVar = b2.a;
        if (d == '>') {
            lVar.m(this);
            fVar.getClass();
            lVar.j();
            lVar.c = wVar;
            return;
        }
        if (d != 65535) {
            lVar.m(this);
            fVar.getClass();
            lVar.j();
        } else {
            lVar.l(this);
            fVar.getClass();
            lVar.j();
            lVar.c = wVar;
        }
    }
}
