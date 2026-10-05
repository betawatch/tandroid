package dd;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public enum w1 extends b2 {
    public w1() {
        super("CdataSection", 66);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        String c10;
        StringBuilder sb2 = lVar.h;
        int p5 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.a;
        if (p5 != -1) {
            c10 = a.c(cArr, strArr, aVar.e, p5);
            aVar.e += p5;
        } else {
            aVar.b();
            int i10 = aVar.e;
            c10 = a.c(cArr, strArr, i10, aVar.c - i10);
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
