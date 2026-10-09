package ci;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class c8 extends s4.t0 {
    public final /* synthetic */ d8 a;

    public c8(d8 d8Var) {
        this.a = d8Var;
    }

    @Override // s4.t0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            d8 d8Var = this.a;
            if (d8Var.i0) {
                d8Var.i0 = false;
            }
        }
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        d8 d8Var = this.a;
        d8Var.e0();
        d8Var.Y();
        if (!d8Var.d.I1 || d8Var.i0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) d8Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
