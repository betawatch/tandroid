// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum lqb extends qsb {
    public lqb() {
        super("Data", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        r6 = zj1.c(r3, r8.h, r0, r4 - r0);
     */
    @Override // qsb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char c;
        char i = zj1Var.i();
        if (i == 0) {
            aqbVar.m(this);
            aqbVar.f(zj1Var.d());
            return;
        }
        if (i == '&') {
            aqbVar.a(qsb.b);
            return;
        }
        if (i == '<') {
            aqbVar.a(qsb.h);
            return;
        }
        if (i == 65535) {
            aqbVar.g(new spb());
            return;
        }
        zj1Var.b();
        int i2 = zj1Var.e;
        int i3 = zj1Var.c;
        char[] cArr = zj1Var.a;
        while (true) {
            int i4 = zj1Var.e;
            if (i4 >= i3 || (c = cArr[i4]) == '&' || c == '<' || c == 0) {
                break;
            } else {
                zj1Var.e = i4 + 1;
            }
        }
        String str = "";
        aqbVar.h(str);
    }
}
