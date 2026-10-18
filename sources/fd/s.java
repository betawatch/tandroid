package fd;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
