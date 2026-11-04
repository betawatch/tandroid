package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum x extends c2 {
    public x() {
        super("Data", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        r9 = ad.a.c(r4, r9.h, r0, r5 - r0);
     */
    @Override // ad.c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(m mVar, a aVar) {
        char c2;
        char i3 = aVar.i();
        if (i3 == 0) {
            mVar.m(this);
            mVar.f(aVar.d());
            return;
        }
        if (i3 == '&') {
            mVar.a(c2.b);
            return;
        }
        if (i3 == '<') {
            mVar.a(c2.h);
            return;
        }
        if (i3 == 65535) {
            mVar.g(new h());
            return;
        }
        aVar.b();
        int i10 = aVar.e;
        int i11 = aVar.c;
        char[] cArr = aVar.a;
        while (true) {
            int i12 = aVar.e;
            if (i12 >= i11 || (c2 = cArr[i12]) == '&' || c2 == '<' || c2 == 0) {
                break;
            } else {
                aVar.e = i12 + 1;
            }
        }
        String str = "";
        mVar.h(str);
    }
}
