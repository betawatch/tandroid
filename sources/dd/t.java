package dd;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public enum t extends b2 {
    public t() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        if (d == '!') {
            lVar.h("<!");
            lVar.c = b2.I;
        } else if (d == '/') {
            lVar.e();
            lVar.c = b2.G;
        } else {
            lVar.h("<");
            aVar.q();
            lVar.c = b2.f;
        }
    }
}
