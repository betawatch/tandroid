package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum u0 extends b2 {
    public u0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // nc.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        m0 m0Var = b2.S;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            lVar.c = m0Var;
            return;
        }
        if (d == '/') {
            lVar.c = b2.a0;
            return;
        }
        w wVar = b2.a;
        if (d == '>') {
            lVar.k();
            lVar.c = wVar;
        } else if (d == 65535) {
            lVar.l(this);
            lVar.c = wVar;
        } else {
            lVar.m(this);
            aVar.q();
            lVar.c = m0Var;
        }
    }
}
