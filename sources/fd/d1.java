package fd;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public enum d1 extends a2 {
    public d1() {
        super("CommentEndBang", 49);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        e eVar = kVar.n;
        char d = aVar.d();
        z0 z0Var = a2.j0;
        if (d == 0) {
            kVar.m(this);
            StringBuilder sb2 = eVar.c;
            sb2.append("--!");
            sb2.append((char) 65533);
            kVar.c = z0Var;
            return;
        }
        if (d == '-') {
            eVar.c.append("--!");
            kVar.c = a2.k0;
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.i();
            kVar.c = vVar;
        } else if (d == 65535) {
            kVar.l(this);
            kVar.i();
            kVar.c = vVar;
        } else {
            StringBuilder sb3 = eVar.c;
            sb3.append("--!");
            sb3.append(d);
            kVar.c = z0Var;
        }
    }
}
