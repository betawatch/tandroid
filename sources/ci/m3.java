package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class m3 extends s4.s0 {
    public final /* synthetic */ w3 a;

    public m3(w3 w3Var) {
        this.a = w3Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.v0 v0Var;
        w3 w3Var = this.a;
        if (!w3Var.n.K1 || (v0Var = w3Var.G) == null || v0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(w3Var.G.getSearchContainer());
    }
}
