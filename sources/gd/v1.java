package gd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public enum v1 extends a2 {
    public v1() {
        super("CdataSection", 66);
    }

    @Override // gd.a2
    public final void d(k kVar, a aVar) {
        String c10;
        StringBuilder sb2 = kVar.h;
        int p10 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.a;
        if (p10 != -1) {
            c10 = a.c(cArr, strArr, aVar.e, p10);
            aVar.e += p10;
        } else {
            aVar.b();
            int i10 = aVar.e;
            c10 = a.c(cArr, strArr, i10, aVar.c - i10);
            aVar.e = aVar.c;
        }
        sb2.append(c10);
        if (aVar.k("]]>") || aVar.j()) {
            String sb3 = sb2.toString();
            c cVar = new c(5, 1);
            cVar.c = sb3;
            kVar.g(cVar);
            kVar.c = a2.a;
        }
    }
}
