package ii;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import s4.u0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
