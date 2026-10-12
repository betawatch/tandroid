package fd;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public enum c1 extends a2 {
    public c1() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        int[] c10 = kVar.c(null, false);
        if (c10 == null) {
            kVar.f('&');
        } else {
            kVar.h(new String(c10, 0, c10.length));
        }
        kVar.c = a2.c;
    }
}
