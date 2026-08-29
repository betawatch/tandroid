package nh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e3 extends f2.a1 {
    public final /* synthetic */ n3 a;

    public e3(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        n3 n3Var = this.a;
        if (!n3Var.n.G1 || (w0Var = n3Var.C) == null || w0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(n3Var.C.getSearchContainer());
    }
}
