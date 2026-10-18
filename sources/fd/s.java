package fd;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
