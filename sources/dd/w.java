package dd;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public enum w extends b2 {
    public w() {
        super("Data", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        r9 = dd.a.c(r4, r9.h, r0, r5 - r0);
     */
    @Override // dd.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(l lVar, a aVar) {
        char c10;
        char i7 = aVar.i();
        if (i7 == 0) {
            lVar.m(this);
            lVar.f(aVar.d());
            return;
        }
        if (i7 == '&') {
            lVar.a(b2.b);
            return;
        }
        if (i7 == '<') {
            lVar.a(b2.h);
            return;
        }
        if (i7 == 65535) {
            lVar.g(new g());
            return;
        }
        aVar.b();
        int i10 = aVar.e;
        int i11 = aVar.c;
        char[] cArr = aVar.a;
        while (true) {
            int i12 = aVar.e;
            if (i12 >= i11 || (c10 = cArr[i12]) == '&' || c10 == '<' || c10 == 0) {
                break;
            } else {
                aVar.e = i12 + 1;
            }
        }
        String str = "";
        lVar.h(str);
    }
}
