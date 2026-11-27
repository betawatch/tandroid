// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class b24 extends t2b {
    public final /* synthetic */ byte H3;
    public final /* synthetic */ c24 I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b24(c24 c24Var, Context context, int i, vnb vnbVar, int i2) {
        super(i, vnbVar, context);
        this.I3 = c24Var;
        this.H3 = i2;
    }

    @Override // t2b
    public final boolean C1() {
        return i86.e(8200);
    }

    @Override // t2b
    public final void I1(int i) {
        b04 b04Var;
        t04 t04Var;
        super.I1(i);
        c24 c24Var = this.I3;
        o24 o24Var = c24Var.H;
        b24 b24Var = c24Var.r;
        boolean z = b24Var.getSelectedCategory() == null;
        int i2 = o24.U2;
        o24Var.L(z);
        byte b = this.H3;
        if (b == 1 && (t04Var = o24Var.J) != null) {
            t04Var.n(b24Var.getSelectedCategory() == null);
        } else if (b == 0 && (b04Var = o24Var.C0) != null) {
            b04Var.p0 = b24Var.getSelectedCategory() == null;
            b04Var.invalidate();
        }
        c24Var.g(false);
    }
}
