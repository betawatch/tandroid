package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum w extends b2 {
    public w() {
        super("Data", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        r9 = lc.a.c(r4, r9.h, r0, r5 - r0);
     */
    @Override // lc.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(l lVar, a aVar) {
        char c10;
        char i9 = aVar.i();
        if (i9 == 0) {
            lVar.m(this);
            lVar.f(aVar.d());
            return;
        }
        if (i9 == '&') {
            lVar.a(b2.b);
            return;
        }
        if (i9 == '<') {
            lVar.a(b2.h);
            return;
        }
        if (i9 == 65535) {
            lVar.h(new g());
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
        lVar.g(str);
    }
}
