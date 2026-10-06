package dd;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public enum z extends b2 {
    public z() {
        super("ScriptDataEscaped", 21);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.c = b2.a;
            return;
        }
        char i10 = aVar.i();
        if (i10 == 0) {
            lVar.m(this);
            aVar.a();
            lVar.f((char) 65533);
        } else if (i10 == '-') {
            lVar.f('-');
            lVar.a(b2.L);
        } else if (i10 != '<') {
            lVar.h(aVar.g('-', '<', 0));
        } else {
            lVar.a(b2.N);
        }
    }
}
