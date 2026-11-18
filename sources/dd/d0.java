package dd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public enum d0 extends b2 {
    public d0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (!aVar.o()) {
            lVar.h("</");
            lVar.c = b2.L;
            return;
        }
        lVar.d(false);
        j jVar = lVar.i;
        char i7 = aVar.i();
        jVar.getClass();
        jVar.h(String.valueOf(i7));
        lVar.h.append(aVar.i());
        lVar.a(b2.Q);
    }
}
