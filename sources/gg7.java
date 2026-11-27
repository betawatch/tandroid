// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gg7 {
    public final qg7 a;
    public final int b;
    public final int c;
    public final byte d;
    public final gg7 e;
    public final int f;

    /* JADX WARN: Multi-variable type inference failed */
    public gg7(vh4 vh4Var, qg7 qg7Var, int i, int i2, int i3, gg7 gg7Var, xdc xdcVar) {
        this.a = qg7Var;
        this.b = i;
        qg7 qg7Var2 = qg7.h;
        int i4 = (qg7Var == qg7Var2 || gg7Var == null) ? i2 : gg7Var.c;
        this.c = i4;
        this.d = i3;
        this.e = gg7Var;
        boolean z = false;
        int i5 = gg7Var != null ? gg7Var.f : 0;
        if ((qg7Var == qg7Var2 && gg7Var == null && i4 != 0) || (gg7Var != null && i4 != gg7Var.c)) {
            z = true;
        }
        i5 = (gg7Var == null || qg7Var != gg7Var.a || z) ? i5 + qg7Var.a(xdcVar) + 4 : i5;
        int ordinal = qg7Var.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                i5 += i3 != 1 ? 11 : 6;
            } else if (ordinal == 4) {
                i5 += ((String) vh4Var.b).substring(i, i3 + i).getBytes(((xs3) vh4Var.c).a[i2].charset()).length << 3;
                if (z) {
                    i5 += 12;
                }
            } else if (ordinal == 6) {
                i5 += 13;
            }
        } else {
            i5 += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
        }
        this.f = i5;
    }
}
