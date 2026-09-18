package ci;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        viewGroup = ((org.telegram.ui.ActionBar.g3) g8Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
