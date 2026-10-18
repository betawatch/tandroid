package fd;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public enum f0 extends a2 {
    public f0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        char i10 = aVar.i();
        if (i10 == 0) {
            kVar.m(this);
            aVar.a();
            kVar.f((char) 65533);
        } else if (i10 == '-') {
            kVar.f(i10);
            kVar.a(a2.S);
        } else if (i10 == '<') {
            kVar.f(i10);
            kVar.a(a2.U);
        } else if (i10 != 65535) {
            kVar.h(aVar.g('-', '<', 0));
        } else {
            kVar.l(this);
            kVar.c = a2.a;
        }
    }
}
