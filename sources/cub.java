// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum cub extends rwb {
    public cub() {
        super("TagName", 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r0 = ik1.c(r2, r14.h, r0, r3 - r0);
     */
    @Override // rwb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(bub bubVar, ik1 ik1Var) {
        char c;
        ik1Var.b();
        int i = ik1Var.e;
        int i2 = ik1Var.c;
        char[] cArr = ik1Var.a;
        while (true) {
            int i3 = ik1Var.e;
            if (i3 >= i2 || (c = cArr[i3]) == '\t' || c == '\n' || c == '\r' || c == '\f' || c == ' ' || c == '/' || c == '>' || c == 0) {
                break;
            } else {
                ik1Var.e = i3 + 1;
            }
        }
        String str = "";
        bubVar.i.y(str);
        char d = ik1Var.d();
        if (d == 0) {
            bubVar.i.y(rwb.J0);
            return;
        }
        if (d != ' ') {
            if (d == '/') {
                bubVar.c = rwb.f0;
                return;
            }
            mub mubVar = rwb.a;
            if (d == '>') {
                bubVar.k();
                bubVar.c = mubVar;
                return;
            }
            if (d == 65535) {
                bubVar.l(this);
                bubVar.c = mubVar;
                return;
            } else if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                wtb wtbVar = bubVar.i;
                wtbVar.getClass();
                wtbVar.y(String.valueOf(d));
                return;
            }
        }
        bubVar.c = rwb.X;
    }
}
