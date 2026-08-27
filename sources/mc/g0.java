package mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public enum g0 extends b2 {
    public g0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // mc.b2
    public final void d(l lVar, a aVar) {
        char i10 = aVar.i();
        if (i10 == 0) {
            lVar.m(this);
            aVar.a();
            lVar.f((char) 65533);
        } else if (i10 == '-') {
            lVar.f(i10);
            lVar.a(b2.O);
        } else if (i10 == '<') {
            lVar.f(i10);
            lVar.a(b2.Q);
        } else if (i10 != 65535) {
            lVar.g(aVar.g('-', '<', 0));
        } else {
            lVar.l(this);
            lVar.c = b2.a;
        }
    }
}
