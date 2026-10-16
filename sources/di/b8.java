package di;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class b8 extends s4.r0 {
    public final /* synthetic */ c8 a;

    public b8(c8 c8Var) {
        this.a = c8Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            c8 c8Var = this.a;
            if (c8Var.i0) {
                c8Var.i0 = false;
            }
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        c8 c8Var = this.a;
        c8Var.e0();
        c8Var.Y();
        if (!c8Var.d.I1 || c8Var.i0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.e3) c8Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
