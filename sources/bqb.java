// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum bqb extends qsb {
    public bqb() {
        super("TagName", 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r0 = zj1.c(r2, r14.h, r0, r3 - r0);
     */
    @Override // qsb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char c;
        zj1Var.b();
        int i = zj1Var.e;
        int i2 = zj1Var.c;
        char[] cArr = zj1Var.a;
        while (true) {
            int i3 = zj1Var.e;
            if (i3 >= i2 || (c = cArr[i3]) == '\t' || c == '\n' || c == '\r' || c == '\f' || c == ' ' || c == '/' || c == '>' || c == 0) {
                break;
            } else {
                zj1Var.e = i3 + 1;
            }
        }
        String str = "";
        aqbVar.i.y(str);
        char d = zj1Var.d();
        if (d == 0) {
            aqbVar.i.y(qsb.J0);
            return;
        }
        if (d != ' ') {
            if (d == '/') {
                aqbVar.c = qsb.f0;
                return;
            }
            lqb lqbVar = qsb.a;
            if (d == '>') {
                aqbVar.k();
                aqbVar.c = lqbVar;
                return;
            }
            if (d == 65535) {
                aqbVar.l(this);
                aqbVar.c = lqbVar;
                return;
            } else if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                vpb vpbVar = aqbVar.i;
                vpbVar.getClass();
                vpbVar.y(String.valueOf(d));
                return;
            }
        }
        aqbVar.c = qsb.X;
    }
}
