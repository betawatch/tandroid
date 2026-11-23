package hi;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class c3 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ c3(m3 m3Var, int i7) {
        this.a = i7;
        this.b = m3Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.q0 q0Var;
        switch (this.a) {
            case 0:
                m3 m3Var = this.b;
                m3Var.getClass();
                m3Var.invalidate();
                break;
            default:
                m3 m3Var2 = this.b;
                if (m3Var2.n.J1 && (q0Var = m3Var2.H) != null && q0Var.getSearchField() != null) {
                    org.telegram.messenger.g0.v1(m3Var2.H.getSearchContainer());
                    break;
                }
                break;
        }
    }
}
