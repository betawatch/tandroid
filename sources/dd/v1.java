package dd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public enum v1 extends b2 {
    public v1() {
        super("BogusDoctype", 65);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.a;
        if (d == '>') {
            lVar.j();
            lVar.c = wVar;
        } else {
            if (d != 65535) {
                return;
            }
            lVar.j();
            lVar.c = wVar;
        }
    }
}
