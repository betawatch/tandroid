package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
