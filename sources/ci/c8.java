package ci;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class c8 extends s4.s0 {
    public final /* synthetic */ d8 a;

    public c8(d8 d8Var) {
        this.a = d8Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            d8 d8Var = this.a;
            if (d8Var.i0) {
                d8Var.i0 = false;
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        d8 d8Var = this.a;
        d8Var.d0();
        d8Var.X();
        if (!d8Var.d.K1 || d8Var.i0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.e3) d8Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
