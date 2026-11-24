// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum csb extends rub {
    public csb() {
        super("TagName", 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r0 = hl1.c(r2, r14.h, r0, r3 - r0);
     */
    @Override // rub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char c;
        hl1Var.b();
        int i = hl1Var.e;
        int i2 = hl1Var.c;
        char[] cArr = hl1Var.a;
        while (true) {
            int i3 = hl1Var.e;
            if (i3 >= i2 || (c = cArr[i3]) == '\t' || c == '\n' || c == '\r' || c == '\f' || c == ' ' || c == '/' || c == '>' || c == 0) {
                break;
            } else {
                hl1Var.e = i3 + 1;
            }
        }
        String str = "";
        bsbVar.i.y(str);
        char d = hl1Var.d();
        if (d == 0) {
            bsbVar.i.y(rub.J0);
            return;
        }
        if (d != ' ') {
            if (d == '/') {
                bsbVar.c = rub.f0;
                return;
            }
            msb msbVar = rub.a;
            if (d == '>') {
                bsbVar.k();
                bsbVar.c = msbVar;
                return;
            }
            if (d == 65535) {
                bsbVar.l(this);
                bsbVar.c = msbVar;
                return;
            } else if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                wrb wrbVar = bsbVar.i;
                wrbVar.getClass();
                wrbVar.y(String.valueOf(d));
                return;
            }
        }
        bsbVar.c = rub.X;
    }
}
