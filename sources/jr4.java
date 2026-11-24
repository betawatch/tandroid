// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class jr4 extends i49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sr4 b;

    public /* synthetic */ jr4(sr4 sr4Var, byte b) {
        this.a = b;
        this.b = sr4Var;
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        sr4 sr4Var = this.b;
        switch (b) {
            case 0:
                sr4Var.invalidate();
                break;
            default:
                r7 r7Var = sr4Var.H;
                if (sr4Var.n.J1 && r7Var != null && r7Var.getSearchField() != null) {
                    gl.t1(r7Var.getSearchContainer());
                    break;
                }
                break;
        }
    }
}
