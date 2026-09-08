package dd;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public enum m extends b2 {
    public m() {
        super("TagName", 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r0 = dd.a.c(r2, r14.h, r0, r3 - r0);
     */
    @Override // dd.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(l lVar, a aVar) {
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
        lVar.i.h(str);
        char d = aVar.d();
        if (d == 0) {
            lVar.i.h(b2.I0);
            return;
        }
        if (d != ' ') {
            if (d == '/') {
                lVar.c = b2.e0;
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
                jVar.h(String.valueOf(d));
                return;
            }
        }
        lVar.c = b2.W;
    }
}
