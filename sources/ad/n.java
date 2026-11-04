package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum n extends c2 {
    public n() {
        super("TagName", 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r0 = ad.a.c(r2, r14.h, r0, r3 - r0);
     */
    @Override // ad.c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(m mVar, a aVar) {
        char c2;
        aVar.b();
        int i3 = aVar.e;
        int i10 = aVar.c;
        char[] cArr = aVar.a;
        while (true) {
            int i11 = aVar.e;
            if (i11 >= i10 || (c2 = cArr[i11]) == '\t' || c2 == '\n' || c2 == '\r' || c2 == '\f' || c2 == ' ' || c2 == '/' || c2 == '>' || c2 == 0) {
                break;
            } else {
                aVar.e = i11 + 1;
            }
        }
        String str = "";
        mVar.i.h(str);
        char d = aVar.d();
        if (d == 0) {
            mVar.i.h(c2.J0);
            return;
        }
        if (d != ' ') {
            if (d == '/') {
                mVar.c = c2.f0;
                return;
            }
            x xVar = c2.a;
            if (d == '>') {
                mVar.k();
                mVar.c = xVar;
                return;
            }
            if (d == 65535) {
                mVar.l(this);
                mVar.c = xVar;
                return;
            } else if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                k kVar = mVar.i;
                kVar.getClass();
                kVar.h(String.valueOf(d));
                return;
            }
        }
        mVar.c = c2.X;
    }
}
