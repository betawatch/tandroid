package bi;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h9 extends s4.s0 {
    public final /* synthetic */ i9 a;

    public h9(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            i9 i9Var = this.a;
            if (i9Var.i0) {
                i9Var.i0 = false;
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        i9 i9Var = this.a;
        i9Var.d0();
        i9Var.X();
        if (!i9Var.d.K1 || i9Var.i0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.h3) i9Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
