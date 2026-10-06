package dd;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.a;
        if (d == '>') {
            lVar.i.j = true;
            lVar.k();
            lVar.c = wVar;
        } else if (d == 65535) {
            lVar.l(this);
            lVar.c = wVar;
        } else {
            lVar.m(this);
            aVar.q();
            lVar.c = b2.W;
        }
    }
}
