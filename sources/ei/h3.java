package ei;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class h3 extends s4.r0 {
    public final /* synthetic */ q3 a;

    public h3(q3 q3Var) {
        this.a = q3Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.u0 u0Var;
        q3 q3Var = this.a;
        if (!q3Var.n.I1 || (u0Var = q3Var.G) == null || u0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(q3Var.G.getSearchContainer());
    }
}
