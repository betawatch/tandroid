package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class n3 extends s4.s0 {
    public final /* synthetic */ x3 a;

    public n3(x3 x3Var) {
        this.a = x3Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.v0 v0Var;
        x3 x3Var = this.a;
        if (!x3Var.n.K1 || (v0Var = x3Var.G) == null || v0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(x3Var.G.getSearchContainer());
    }
}
