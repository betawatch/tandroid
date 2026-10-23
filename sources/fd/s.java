package fd;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public enum s extends a2 {
    public s() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        if (d == '!') {
            kVar.h("<!");
            kVar.c = a2.I;
        } else if (d == '/') {
            kVar.e();
            kVar.c = a2.G;
        } else {
            kVar.h("<");
            aVar.q();
            kVar.c = a2.f;
        }
    }
}
