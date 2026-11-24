// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
