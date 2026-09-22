package dd;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
