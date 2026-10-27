package fi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
