package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum z extends b2 {
    public z() {
        super("ScriptDataEscaped", 21);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.c = b2.a;
            return;
        }
        char i9 = aVar.i();
        if (i9 == 0) {
            lVar.m(this);
            aVar.a();
            lVar.f((char) 65533);
        } else if (i9 == '-') {
            lVar.f('-');
            lVar.a(b2.H);
        } else if (i9 != '<') {
            lVar.g(aVar.g('-', '<', 0));
        } else {
            lVar.a(b2.J);
        }
    }
}
