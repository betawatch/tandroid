package mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public enum t extends b2 {
    public t() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // mc.b2
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
