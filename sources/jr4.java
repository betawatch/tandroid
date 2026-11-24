// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
