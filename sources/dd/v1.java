package dd;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
