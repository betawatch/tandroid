package mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public enum w extends b2 {
    public w() {
        super("Data", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        r9 = mc.a.c(r4, r9.h, r0, r5 - r0);
     */
    @Override // mc.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(l lVar, a aVar) {
        char c10;
        char i10 = aVar.i();
        if (i10 == 0) {
            lVar.m(this);
            lVar.f(aVar.d());
            return;
        }
        if (i10 == '&') {
            lVar.a(b2.b);
            return;
        }
        if (i10 == '<') {
            lVar.a(b2.h);
            return;
        }
        if (i10 == 65535) {
            lVar.h(new g());
            return;
        }
        aVar.b();
        int i11 = aVar.e;
        int i12 = aVar.c;
        char[] cArr = aVar.a;
        while (true) {
            int i13 = aVar.e;
            if (i13 >= i12 || (c10 = cArr[i13]) == '&' || c10 == '<' || c10 == 0) {
                break;
            } else {
                aVar.e = i13 + 1;
            }
        }
        String str = "";
        lVar.g(str);
    }
}
