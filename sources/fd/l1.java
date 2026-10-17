package fd;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public enum l1 extends a2 {
    public l1() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            fVar.d.append((char) 65533);
            return;
        }
        if (d == '\'') {
            kVar.c = a2.v0;
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.m(this);
            fVar.getClass();
            kVar.j();
            kVar.c = vVar;
            return;
        }
        if (d != 65535) {
            fVar.d.append(d);
            return;
        }
        kVar.l(this);
        fVar.getClass();
        kVar.j();
        kVar.c = vVar;
    }
}
