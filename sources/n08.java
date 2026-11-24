// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n08 extends i49 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ t08 b;

    /* JADX WARN: Multi-variable type inference failed */
    public n08(t08 t08Var, int i) {
        this.b = t08Var;
        this.a = i;
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        t08 t08Var = this.b;
        t08Var.h();
        if (t08Var.L != null) {
            if (t08Var.K == null || !t08Var.b()) {
                return;
            }
            t08Var.K.l(false);
            return;
        }
        a18 a18Var = t08Var.q0;
        xsa xsaVar = this.a ? a18Var.c : a18Var.b;
        if (xsaVar == null || !t08Var.b()) {
            return;
        }
        xsaVar.a();
    }
}
