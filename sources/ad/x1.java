package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum x1 extends c2 {
    public x1() {
        super("CdataSection", 66);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        String c2;
        StringBuilder sb2 = mVar.h;
        int p10 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.a;
        if (p10 != -1) {
            c2 = a.c(cArr, strArr, aVar.e, p10);
            aVar.e += p10;
        } else {
            aVar.b();
            int i3 = aVar.e;
            c2 = a.c(cArr, strArr, i3, aVar.c - i3);
            aVar.e = aVar.c;
        }
        sb2.append(c2);
        if (aVar.k("]]>") || aVar.j()) {
            String sb3 = sb2.toString();
            d dVar = new d(5, 0);
            dVar.c = sb3;
            mVar.g(dVar);
            mVar.c = c2.a;
        }
    }
}
