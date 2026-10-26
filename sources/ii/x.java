package ii;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import s4.u0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class x extends u0 {
    public final /* synthetic */ j0 a;

    public x(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        j0 j0Var = this.a;
        if (j0Var.G.I1) {
            AndroidUtilities.hideKeyboard(j0Var.E.r);
        }
    }
}
