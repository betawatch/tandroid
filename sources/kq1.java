// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kq1 extends cl0 {
    public final /* synthetic */ byte s;
    public final /* synthetic */ zu1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kq1(zu1 zu1Var, vnb vnbVar, int i, byte b) {
        super(i, vnbVar);
        this.s = b;
        this.w = zu1Var;
    }

    @Override // cl0, bl0
    public final int Q1() {
        int i;
        int i2;
        byte b = this.s;
        zu1 zu1Var = this.w;
        switch (b) {
            case 0:
                i = ((e) zu1Var).currentAccount;
                if (!dtd.d(i, zu1Var.Ba)) {
                    return vm2.o(zu1Var.getThemedColor(aob.Je), jn7.d4);
                }
                xu1 xu1Var = zu1Var.Ba;
                if (xu1Var == null || xu1Var.a()) {
                    a();
                    return this.d;
                }
                a();
                return vm2.o(this.d, jn7.s3);
            case 1:
                return zu1Var.x.Q1();
            default:
                i2 = ((e) zu1Var).currentAccount;
                if (!dtd.d(i2, zu1Var.Ba)) {
                    return vm2.o(zu1Var.getThemedColor(aob.d6), jn7.d4);
                }
                xu1 xu1Var2 = zu1Var.Ba;
                if (xu1Var2 == null || xu1Var2.a()) {
                    a();
                    return this.d;
                }
                a();
                return vm2.o(this.d, jn7.s3);
        }
    }

    @Override // cl0, bl0
    public final int X() {
        xu1 xu1Var;
        switch (this.s) {
            case 0:
                int X = super.X();
                if (X == 0 || (xu1Var = this.w.Ba) == null || !xu1Var.a()) {
                    return X;
                }
                return 385875967;
            case 1:
                return 0;
            default:
                return super.X();
        }
    }

    @Override // cl0, bl0
    public final int x0() {
        switch (this.s) {
            case 1:
                return 0;
            default:
                return super.x0();
        }
    }
}
