package kh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h3 extends f2.d1 {
    public final /* synthetic */ q3 a;

    public h3(q3 q3Var) {
        this.a = q3Var;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        q3 q3Var = this.a;
        if (!q3Var.n.G1 || (w0Var = q3Var.C) == null || w0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(q3Var.C.getSearchContainer());
    }
}
