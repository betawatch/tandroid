package fd;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public enum v1 extends a2 {
    public v1() {
        super("CdataSection", 66);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        String c10;
        StringBuilder sb2 = kVar.h;
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
            c cVar = new c(5, 1);
            cVar.c = sb3;
            kVar.g(cVar);
            kVar.c = a2.a;
        }
    }
}
