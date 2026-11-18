package dd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
            lVar.c = b2.J;
        } else if (d == '/') {
            lVar.e();
            lVar.c = b2.H;
        } else {
            lVar.h("<");
            aVar.q();
            lVar.c = b2.f;
        }
    }
}
