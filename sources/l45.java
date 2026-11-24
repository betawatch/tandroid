// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l45 extends yo {
    public final /* synthetic */ h75 c;

    public l45(h75 h75Var) {
        this.c = h75Var;
    }

    @Override // yo
    public final int i(int i) {
        c75 c75Var;
        int i2;
        int i3;
        int i4 = h75.u5 ? 6 : 2;
        if (h75.v5 || i < (i2 = (c75Var = this.c.I1).H) || i >= (i3 = c75Var.I)) {
            return i4;
        }
        int i5 = i3 - i2;
        int i6 = (i != i3 - 1 || (!h75.u5 && i5 % 2 == 0)) ? 1 : 2;
        if (!h75.u5) {
            return i6;
        }
        if (i5 == 1) {
            return 6;
        }
        return i5 == 2 ? 3 : 2;
    }
}
