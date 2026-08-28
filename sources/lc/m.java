package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum m extends b2 {
    public m() {
        super("TagName", 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r0 = lc.a.c(r2, r14.h, r0, r3 - r0);
     */
    @Override // lc.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(l lVar, a aVar) {
        char c10;
        aVar.b();
        int i9 = aVar.e;
        int i10 = aVar.c;
        char[] cArr = aVar.a;
        while (true) {
            int i11 = aVar.e;
            if (i11 >= i10 || (c10 = cArr[i11]) == '\t' || c10 == '\n' || c10 == '\r' || c10 == '\f' || c10 == ' ' || c10 == '/' || c10 == '>' || c10 == 0) {
                break;
            } else {
                aVar.e = i11 + 1;
            }
        }
        String str = "";
        lVar.i.i(str);
        char d = aVar.d();
        if (d == 0) {
            lVar.i.i(b2.E0);
            return;
        }
        if (d != ' ') {
            if (d == '/') {
                lVar.c = b2.a0;
                return;
            }
            w wVar = b2.a;
            if (d == '>') {
                lVar.k();
                lVar.c = wVar;
                return;
            }
            if (d == 65535) {
                lVar.l(this);
                lVar.c = wVar;
                return;
            } else if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                j jVar = lVar.i;
                jVar.getClass();
                jVar.i(String.valueOf(d));
                return;
            }
        }
        lVar.c = b2.S;
    }
}
