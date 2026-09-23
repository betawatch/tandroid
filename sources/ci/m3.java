package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
