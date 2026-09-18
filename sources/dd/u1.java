package dd;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
