package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum m extends b2 {
    public m() {
        super("TagName", 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r0 = nc.a.c(r2, r14.h, r0, r3 - r0);
     */
    @Override // nc.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(l lVar, a aVar) {
        char c3;
        aVar.b();
        int i10 = aVar.e;
        int i11 = aVar.c;
        char[] cArr = aVar.a;
        while (true) {
            int i12 = aVar.e;
            if (i12 >= i11 || (c3 = cArr[i12]) == '\t' || c3 == '\n' || c3 == '\r' || c3 == '\f' || c3 == ' ' || c3 == '/' || c3 == '>' || c3 == 0) {
                break;
            } else {
                aVar.e = i12 + 1;
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
