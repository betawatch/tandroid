// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum msb extends rub {
    public msb() {
        super("Data", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        r6 = hl1.c(r3, r8.h, r0, r4 - r0);
     */
    @Override // rub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char c;
        char i = hl1Var.i();
        if (i == 0) {
            bsbVar.m(this);
            bsbVar.f(hl1Var.d());
            return;
        }
        if (i == '&') {
            bsbVar.a(rub.b);
            return;
        }
        if (i == '<') {
            bsbVar.a(rub.h);
            return;
        }
        if (i == 65535) {
            bsbVar.g(new trb());
            return;
        }
        hl1Var.b();
        int i2 = hl1Var.e;
        int i3 = hl1Var.c;
        char[] cArr = hl1Var.a;
        while (true) {
            int i4 = hl1Var.e;
            if (i4 >= i3 || (c = cArr[i4]) == '&' || c == '<' || c == 0) {
                break;
            } else {
                hl1Var.e = i4 + 1;
            }
        }
        String str = "";
        bsbVar.h(str);
    }
}
