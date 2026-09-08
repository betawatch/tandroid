package di;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class f8 extends s4.s0 {
    public final /* synthetic */ g8 a;

    public f8(g8 g8Var) {
        this.a = g8Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            g8 g8Var = this.a;
            if (g8Var.i0) {
                g8Var.i0 = false;
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        g8 g8Var = this.a;
        g8Var.d0();
        g8Var.X();
        if (!g8Var.d.K1 || g8Var.i0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) g8Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
