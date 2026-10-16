package di;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class l3 extends s4.r0 {
    public final /* synthetic */ v3 a;

    public l3(v3 v3Var) {
        this.a = v3Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.u0 u0Var;
        v3 v3Var = this.a;
        if (!v3Var.n.I1 || (u0Var = v3Var.G) == null || u0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(v3Var.G.getSearchContainer());
    }
}
