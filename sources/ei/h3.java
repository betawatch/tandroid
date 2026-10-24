package ei;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
