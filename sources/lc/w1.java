package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum w1 extends b2 {
    public w1() {
        super("CdataSection", 66);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        String c10;
        StringBuilder sb2 = lVar.h;
        int p6 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.a;
        if (p6 != -1) {
            c10 = a.c(cArr, strArr, aVar.e, p6);
            aVar.e += p6;
        } else {
            aVar.b();
            int i9 = aVar.e;
            c10 = a.c(cArr, strArr, i9, aVar.c - i9);
            aVar.e = aVar.c;
        }
        sb2.append(c10);
        if (aVar.k("]]>") || aVar.j()) {
            String sb3 = sb2.toString();
            c cVar = new c(5, 0);
            cVar.c = sb3;
            lVar.h(cVar);
            lVar.c = b2.a;
        }
    }
}
