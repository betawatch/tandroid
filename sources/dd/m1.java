package dd;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
