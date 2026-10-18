package fd;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
