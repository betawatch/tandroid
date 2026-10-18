package fd;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public enum y extends a2 {
    public y() {
        super("ScriptDataEscaped", 21);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        if (aVar.j()) {
            kVar.l(this);
            kVar.c = a2.a;
            return;
        }
        char i10 = aVar.i();
        if (i10 == 0) {
            kVar.m(this);
            aVar.a();
            kVar.f((char) 65533);
        } else if (i10 == '-') {
            kVar.f('-');
            kVar.a(a2.L);
        } else if (i10 != '<') {
            kVar.h(aVar.g('-', '<', 0));
        } else {
            kVar.a(a2.N);
        }
    }
}
