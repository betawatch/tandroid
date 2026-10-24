package ei;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class r7 extends s4.r0 {
    public final /* synthetic */ s7 a;

    public r7(s7 s7Var) {
        this.a = s7Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            s7 s7Var = this.a;
            if (s7Var.i0) {
                s7Var.i0 = false;
            }
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        s7 s7Var = this.a;
        s7Var.d0();
        s7Var.X();
        if (!s7Var.d.I1 || s7Var.i0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.h3) s7Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
