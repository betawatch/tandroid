package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum q1 extends b2 {
    public q1() {
        super("AfterDoctypeSystemKeyword", 60);
    }

    @Override // nc.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            lVar.c = b2.u0;
            return;
        }
        if (d == '\"') {
            lVar.m(this);
            lVar.c = b2.v0;
            return;
        }
        if (d == '\'') {
            lVar.m(this);
            lVar.c = b2.w0;
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
