package dd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public enum w1 extends b2 {
    public w1() {
        super("CdataSection", 66);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        String c10;
        StringBuilder sb2 = lVar.h;
        int p10 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.a;
        if (p10 != -1) {
            c10 = a.c(cArr, strArr, aVar.e, p10);
            aVar.e += p10;
        } else {
            aVar.b();
            int i7 = aVar.e;
            c10 = a.c(cArr, strArr, i7, aVar.c - i7);
            aVar.e = aVar.c;
        }
        sb2.append(c10);
        if (aVar.k("]]>") || aVar.j()) {
            String sb3 = sb2.toString();
            c cVar = new c(5, 0);
            cVar.c = sb3;
            lVar.g(cVar);
            lVar.c = b2.a;
        }
    }
}
