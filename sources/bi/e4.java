package bi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class e4 extends s4.s0 {
    public final /* synthetic */ p4 a;

    public e4(p4 p4Var) {
        this.a = p4Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        p4 p4Var = this.a;
        if (!p4Var.n.K1 || (w0Var = p4Var.G) == null || w0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(p4Var.G.getSearchContainer());
    }
}
