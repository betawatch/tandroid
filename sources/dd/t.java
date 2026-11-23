package dd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
