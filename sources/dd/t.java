package dd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
