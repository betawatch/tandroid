// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class da6 extends i49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qa6 b;

    public /* synthetic */ da6(qa6 qa6Var, byte b) {
        this.a = b;
        this.b = qa6Var;
    }

    @Override // i49
    public final void a(RecyclerView recyclerView, int i) {
        byte b = this.a;
        qa6 qa6Var = this.b;
        switch (b) {
            case 0:
                if (i == 1 && qa6Var.u0 && qa6Var.v0) {
                    gl.t1(qa6Var.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                boolean z = i != 0;
                qa6Var.N = z;
                if (!z && qa6Var.I != null) {
                    qa6Var.I = null;
                    break;
                }
                break;
        }
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 1:
                qa6 qa6Var = this.b;
                qa6Var.M0(false);
                if (qa6Var.I != null) {
                    qa6Var.K += i2;
                    break;
                }
                break;
        }
    }
}
