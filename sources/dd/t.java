package dd;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
