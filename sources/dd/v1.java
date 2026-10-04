package dd;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
