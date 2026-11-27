// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum mub extends rwb {
    public mub() {
        super("Data", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        r6 = ik1.c(r3, r8.h, r0, r4 - r0);
     */
    @Override // rwb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(bub bubVar, ik1 ik1Var) {
        char c;
        char i = ik1Var.i();
        if (i == 0) {
            bubVar.m(this);
            bubVar.f(ik1Var.d());
            return;
        }
        if (i == '&') {
            bubVar.a(rwb.b);
            return;
        }
        if (i == '<') {
            bubVar.a(rwb.h);
            return;
        }
        if (i == 65535) {
            bubVar.g(new ttb());
            return;
        }
        ik1Var.b();
        int i2 = ik1Var.e;
        int i3 = ik1Var.c;
        char[] cArr = ik1Var.a;
        while (true) {
            int i4 = ik1Var.e;
            if (i4 >= i3 || (c = cArr[i4]) == '&' || c == '<' || c == 0) {
                break;
            } else {
                ik1Var.e = i4 + 1;
            }
        }
        String str = "";
        bubVar.h(str);
    }
}
