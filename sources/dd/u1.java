package dd;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public enum u1 extends b2 {
    public u1() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            return;
        }
        w wVar = b2.a;
        if (d == '>') {
            lVar.j();
            lVar.c = wVar;
        } else if (d != 65535) {
            lVar.m(this);
            lVar.c = b2.C0;
        } else {
            lVar.l(this);
            lVar.m.getClass();
            lVar.j();
            lVar.c = wVar;
        }
    }
}
