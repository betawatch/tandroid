package hi;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class u2 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ u2(e3 e3Var, int i7) {
        this.a = i7;
        this.b = e3Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.r0 r0Var;
        switch (this.a) {
            case 0:
                e3 e3Var = this.b;
                e3Var.getClass();
                e3Var.invalidate();
                break;
            default:
                e3 e3Var2 = this.b;
                if (e3Var2.n.J1 && (r0Var = e3Var2.H) != null && r0Var.getSearchField() != null) {
                    org.telegram.messenger.g0.v1(e3Var2.H.getSearchContainer());
                    break;
                }
                break;
        }
    }
}
