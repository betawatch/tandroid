package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum t extends b2 {
    public t() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        if (d == '!') {
            lVar.g("<!");
            lVar.c = b2.E;
        } else if (d == '/') {
            lVar.e();
            lVar.c = b2.C;
        } else {
            lVar.g("<");
            aVar.q();
            lVar.c = b2.f;
        }
    }
}
