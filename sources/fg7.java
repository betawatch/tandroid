// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class fg7 {
    public final pg7 a;
    public final int b;
    public final int c;
    public final byte d;
    public final fg7 e;
    public final int f;

    /* JADX WARN: Multi-variable type inference failed */
    public fg7(vh4 vh4Var, pg7 pg7Var, int i, int i2, int i3, fg7 fg7Var, xdc xdcVar) {
        this.a = pg7Var;
        this.b = i;
        pg7 pg7Var2 = pg7.h;
        int i4 = (pg7Var == pg7Var2 || fg7Var == null) ? i2 : fg7Var.c;
        this.c = i4;
        this.d = i3;
        this.e = fg7Var;
        boolean z = false;
        int i5 = fg7Var != null ? fg7Var.f : 0;
        if ((pg7Var == pg7Var2 && fg7Var == null && i4 != 0) || (fg7Var != null && i4 != fg7Var.c)) {
            z = true;
        }
        i5 = (fg7Var == null || pg7Var != fg7Var.a || z) ? i5 + pg7Var.a(xdcVar) + 4 : i5;
        int ordinal = pg7Var.ordinal();
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
