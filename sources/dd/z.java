package dd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        char i7 = aVar.i();
        if (i7 == 0) {
            lVar.m(this);
            aVar.a();
            lVar.f((char) 65533);
        } else if (i7 == '-') {
            lVar.f('-');
            lVar.a(b2.M);
        } else if (i7 != '<') {
            lVar.h(aVar.g('-', '<', 0));
        } else {
            lVar.a(b2.O);
        }
    }
}
