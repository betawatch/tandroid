package dd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public enum g0 extends b2 {
    public g0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char i7 = aVar.i();
        if (i7 == 0) {
            lVar.m(this);
            aVar.a();
            lVar.f((char) 65533);
        } else if (i7 == '-') {
            lVar.f(i7);
            lVar.a(b2.T);
        } else if (i7 == '<') {
            lVar.f(i7);
            lVar.a(b2.V);
        } else if (i7 != 65535) {
            lVar.h(aVar.g('-', '<', 0));
        } else {
            lVar.l(this);
            lVar.c = b2.a;
        }
    }
}
