package fd;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public enum l extends a2 {
    public l() {
        super("TagName", 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r0 = fd.a.c(r2, r14.h, r0, r3 - r0);
     */
    @Override // fd.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(k kVar, a aVar) {
        char c10;
        aVar.b();
        int i10 = aVar.e;
        int i11 = aVar.c;
        char[] cArr = aVar.a;
        while (true) {
            int i12 = aVar.e;
            if (i12 >= i11 || (c10 = cArr[i12]) == '\t' || c10 == '\n' || c10 == '\r' || c10 == '\f' || c10 == ' ' || c10 == '/' || c10 == '>' || c10 == 0) {
                break;
            } else {
                aVar.e = i12 + 1;
            }
        }
        String str = "";
        kVar.i.h(str);
        char d = aVar.d();
        if (d == 0) {
            kVar.i.h(a2.I0);
            return;
        }
        if (d != ' ') {
            if (d == '/') {
                kVar.c = a2.e0;
                return;
            }
            v vVar = a2.a;
            if (d == '>') {
                kVar.k();
                kVar.c = vVar;
                return;
            }
            if (d == 65535) {
                kVar.l(this);
                kVar.c = vVar;
                return;
            } else if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                j jVar = kVar.i;
                jVar.getClass();
                jVar.h(String.valueOf(d));
                return;
            }
        }
        kVar.c = a2.W;
    }
}
