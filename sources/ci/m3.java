package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
