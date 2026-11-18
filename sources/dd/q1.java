package dd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
            lVar.c = b2.z0;
            return;
        }
        if (d == '\"') {
            lVar.m(this);
            lVar.c = b2.A0;
            return;
        }
        if (d == '\'') {
            lVar.m(this);
            lVar.c = b2.B0;
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
