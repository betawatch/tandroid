package ci;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class b8 extends s4.s0 {
    public final /* synthetic */ c8 a;

    public b8(c8 c8Var) {
        this.a = c8Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            c8 c8Var = this.a;
            if (c8Var.i0) {
                c8Var.i0 = false;
            }
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        c8 c8Var = this.a;
        c8Var.d0();
        if (!c8Var.d.K1 || c8Var.i0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) c8Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
