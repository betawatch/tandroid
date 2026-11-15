package dd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
