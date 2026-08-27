package lh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class g3 extends f2.b1 {
    public final /* synthetic */ p3 a;

    public g3(p3 p3Var) {
        this.a = p3Var;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.v0 v0Var;
        p3 p3Var = this.a;
        if (!p3Var.n.G1 || (v0Var = p3Var.C) == null || v0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(p3Var.C.getSearchContainer());
    }
}
