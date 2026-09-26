package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class m3 extends s4.s0 {
    public final /* synthetic */ w3 a;

    public m3(w3 w3Var) {
        this.a = w3Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.u0 u0Var;
        w3 w3Var = this.a;
        if (!w3Var.n.K1 || (u0Var = w3Var.G) == null || u0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(w3Var.G.getSearchContainer());
    }
}
