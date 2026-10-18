package fd;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public enum t1 extends a2 {
    public t1() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.j();
            kVar.c = vVar;
        } else if (d != 65535) {
            kVar.m(this);
            kVar.c = a2.C0;
        } else {
            kVar.l(this);
            kVar.m.getClass();
            kVar.j();
            kVar.c = vVar;
        }
    }
}
