package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class n3 extends s4.s0 {
    public final /* synthetic */ x3 a;

    public n3(x3 x3Var) {
        this.a = x3Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        x3 x3Var = this.a;
        if (!x3Var.n.K1 || (w0Var = x3Var.G) == null || w0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(x3Var.G.getSearchContainer());
    }
}
