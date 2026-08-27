package lh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class q7 extends f2.b1 {
    public final /* synthetic */ r7 a;

    public q7(r7 r7Var) {
        this.a = r7Var;
    }

    @Override // f2.b1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            r7 r7Var = this.a;
            if (r7Var.e0) {
                r7Var.e0 = false;
            }
        }
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        r7 r7Var = this.a;
        r7Var.d0();
        r7Var.X();
        if (!r7Var.d.G1 || r7Var.e0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.e3) r7Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
