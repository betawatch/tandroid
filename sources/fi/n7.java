package fi;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class n7 extends s4.u0 {
    public final /* synthetic */ o7 a;

    public n7(o7 o7Var) {
        this.a = o7Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            o7 o7Var = this.a;
            if (o7Var.i0) {
                o7Var.i0 = false;
            }
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        o7 o7Var = this.a;
        o7Var.d0();
        if (!o7Var.d.I1 || o7Var.i0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.k3) o7Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
