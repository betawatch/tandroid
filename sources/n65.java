// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class n65 extends zo {
    public final /* synthetic */ j95 c;

    public n65(j95 j95Var) {
        this.c = j95Var;
    }

    @Override // zo
    public final int i(int i) {
        e95 e95Var;
        int i2;
        int i3;
        int i4 = j95.u5 ? 6 : 2;
        if (j95.v5 || i < (i2 = (e95Var = this.c.I1).H) || i >= (i3 = e95Var.I)) {
            return i4;
        }
        int i5 = i3 - i2;
        int i6 = (i != i3 - 1 || (!j95.u5 && i5 % 2 == 0)) ? 1 : 2;
        if (!j95.u5) {
            return i6;
        }
        if (i5 == 1) {
            return 6;
        }
        return i5 == 2 ? 3 : 2;
    }
}
