// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nq5 extends i49 {
    public final /* synthetic */ t26 a;
    public final /* synthetic */ zq5 b;

    public nq5(zq5 zq5Var, t26 t26Var) {
        this.b = zq5Var;
        this.a = t26Var;
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        zq5 zq5Var = this.b;
        zq5Var.I0();
        if (!zq5Var.L1 || zq5Var.K1) {
            return;
        }
        if (zq5Var.M1 - this.a.M0() < 10) {
            zq5Var.E0();
        }
    }
}
