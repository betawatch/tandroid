package gd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public enum h1 extends a2 {
    public h1() {
        super("AfterDoctypeName", 53);
    }

    @Override // gd.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        boolean j10 = aVar.j();
        v vVar = a2.a;
        if (j10) {
            kVar.l(this);
            fVar.getClass();
            kVar.j();
            kVar.c = vVar;
            return;
        }
        if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
            return;
        }
        if (aVar.m('>')) {
            kVar.j();
            kVar.a(vVar);
            return;
        }
        if (aVar.l("PUBLIC")) {
            fVar.getClass();
            kVar.c = a2.r0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            kVar.c = a2.x0;
        } else {
            kVar.m(this);
            fVar.getClass();
            kVar.a(a2.C0);
        }
    }
}
