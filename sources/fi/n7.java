package fi;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
