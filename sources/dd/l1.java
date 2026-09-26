package dd;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public enum l1 extends b2 {
    public l1() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
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
        if (d == '\"') {
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
