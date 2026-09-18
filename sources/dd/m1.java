package dd;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public enum m1 extends b2 {
    public m1() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        f fVar = lVar.m;
        char d = aVar.d();
        if (d == 0) {
            lVar.m(this);
            fVar.d.append((char) 65533);
            return;
        }
        if (d == '\'') {
            lVar.c = b2.v0;
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
            fVar.d.append(d);
            return;
        }
        lVar.l(this);
        fVar.getClass();
        lVar.j();
        lVar.c = wVar;
    }
}
