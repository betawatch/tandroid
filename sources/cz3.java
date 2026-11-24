// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cz3 extends r35 {
    public final /* synthetic */ t14 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz3(t14 t14Var) {
        super(5);
        this.Q = t14Var;
    }

    @Override // r35, t26, d49
    public final int n0(int i, wg2 wg2Var, p49 p49Var) {
        int n0 = super.n0(i, wg2Var, p49Var);
        t14 t14Var = this.Q;
        if (n0 != 0 && t14Var.E0.getScrollState() == 1) {
            t14Var.Y1 = false;
            t14Var.Z();
        }
        if (t14Var.U0 == null) {
            mz3 mz3Var = new mz3(t14Var, t14Var.d1, t14Var.u1.a(), t14Var.u1.f(), (byte) 0);
            t14Var.U0 = mz3Var;
            mz3Var.a();
        }
        t14Var.U0.b();
        return n0;
    }

    @Override // d49
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        try {
            v26 v26Var = new v26(recyclerView.getContext(), 2);
            v26Var.a = i;
            v0(v26Var);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
