// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j65 extends yp {
    public final /* synthetic */ g95 c;

    public j65(g95 g95Var) {
        this.c = g95Var;
    }

    @Override // yp
    public final int i(int i) {
        b95 b95Var;
        int i2;
        int i3;
        int i4 = g95.u5 ? 6 : 2;
        if (g95.v5 || i < (i2 = (b95Var = this.c.I1).H) || i >= (i3 = b95Var.I)) {
            return i4;
        }
        int i5 = i3 - i2;
        int i6 = (i != i3 - 1 || (!g95.u5 && i5 % 2 == 0)) ? 1 : 2;
        if (!g95.u5) {
            return i6;
        }
        if (i5 == 1) {
            return 6;
        }
        return i5 == 2 ? 3 : 2;
    }
}
