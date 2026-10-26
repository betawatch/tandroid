package fi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class f3 extends s4.u0 {
    public final /* synthetic */ o3 a;

    public f3(o3 o3Var) {
        this.a = o3Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        o3 o3Var = this.a;
        if (!o3Var.n.I1 || (w0Var = o3Var.G) == null || w0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(o3Var.G.getSearchContainer());
    }
}
