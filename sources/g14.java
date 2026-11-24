// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class g14 extends tya {
    public final /* synthetic */ byte H3;
    public final /* synthetic */ h14 I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g14(h14 h14Var, Context context, int i, wjb wjbVar, int i2) {
        super(i, wjbVar, context);
        this.I3 = h14Var;
        this.H3 = i2;
    }

    @Override // tya
    public final boolean B1() {
        return e66.e(8200);
    }

    @Override // tya
    public final void H1(int i) {
        gz3 gz3Var;
        yz3 yz3Var;
        super.H1(i);
        h14 h14Var = this.I3;
        t14 t14Var = h14Var.H;
        g14 g14Var = h14Var.r;
        boolean z = g14Var.getSelectedCategory() == null;
        int i2 = t14.U2;
        t14Var.M(z);
        byte b = this.H3;
        if (b == 1 && (yz3Var = t14Var.J) != null) {
            yz3Var.n(g14Var.getSelectedCategory() == null);
        } else if (b == 0 && (gz3Var = t14Var.C0) != null) {
            gz3Var.p0 = g14Var.getSelectedCategory() == null;
            gz3Var.invalidate();
        }
        h14Var.g(false);
    }
}
