package fd;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
