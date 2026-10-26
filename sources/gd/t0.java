package gd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public enum t0 extends a2 {
    public t0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // gd.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        l0 l0Var = a2.W;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            kVar.c = l0Var;
            return;
        }
        if (d == '/') {
            kVar.c = a2.e0;
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.k();
            kVar.c = vVar;
        } else if (d == 65535) {
            kVar.l(this);
            kVar.c = vVar;
        } else {
            kVar.m(this);
            aVar.q();
            kVar.c = l0Var;
        }
    }
}
