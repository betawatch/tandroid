package nh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class f7 extends f2.a1 {
    public final /* synthetic */ g7 a;

    public f7(g7 g7Var) {
        this.a = g7Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            g7 g7Var = this.a;
            if (g7Var.e0) {
                g7Var.e0 = false;
            }
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        g7 g7Var = this.a;
        g7Var.d0();
        g7Var.X();
        if (!g7Var.d.G1 || g7Var.e0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) g7Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
